package com.example.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.Product;
import com.example.service.FileService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RestController
public class FileController {

	@Autowired
	private FileService fileService;

	@PostMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestBody MultipartFile file) {
		try {
			Boolean uploadFile = fileService.uploadFile(file);
			if (uploadFile) {
				return new ResponseEntity<>("file uploaded successfully", HttpStatus.CREATED);

			} else {
				return new ResponseEntity<>("file uploaded failed", HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/download")
	public ResponseEntity<?> downloadFile(@RequestParam String file) {

		try {
			byte[] downloadFile = fileService.downloadFile(file);

			String contentType = getContentType(file);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.parseMediaType(contentType));
			// headers.setContentLength(file.length());
			headers.setContentDispositionFormData("attachment", file);

			return ResponseEntity.ok().headers(headers).body(downloadFile);

		} catch (FileNotFoundException e) {
			return new ResponseEntity<>("file not found", HttpStatus.NOT_FOUND);

		} catch (IOException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	public String getContentType(String fileName) {

		String extension = FilenameUtils.getExtension(fileName);
		switch (extension) {

		case "pdf":
			return "applcation/pdf";
		case "xlsx":
			return "application/vnd.openxmlformats-officedocument.spreadsheettml.sheet";
		case "txt":
			return "text/plan";
		case "jpeg":
			return "image/jpeg";
		default:
			return "application/octet-stream";

		}
	}

	@PostMapping("/upload-data")
	public ResponseEntity<?> uploadFileWithData(@RequestParam String product, @RequestParam MultipartFile file) {
//		log.info("Product:{}", product);
//		log.info("file:{}", file);

		List<String> extension = Arrays.asList("jpeg", "jpg", "png");
		if (file.isEmpty()) {
			return new ResponseEntity<>("please upload file ", HttpStatus.BAD_REQUEST);
		} else {
			String originalFilename = file.getOriginalFilename();
			String fileExtension = FilenameUtils.getExtension(originalFilename);
			boolean contains = extension.contains(fileExtension);
			if (!contains) {
				return new ResponseEntity<>("please upload image file ", HttpStatus.BAD_REQUEST);

			}
		}
		try {
			String filename = fileService.uploadFileWithData(file);
			if (StringUtils.hasText(filename)) {

				ObjectMapper objectMapper = new ObjectMapper();
				Product productObj = objectMapper.readValue(product, Product.class);

				// String filename = file.getOriginalFilename();
				productObj.setImageName(filename);

				Boolean saveProduct = fileService.saveProduct(productObj);
				if (saveProduct) {
					return new ResponseEntity<>("file and image uploaded successfully", HttpStatus.CREATED);
				} else {
					return new ResponseEntity<>("file uploaded but product not saved",
							HttpStatus.INTERNAL_SERVER_ERROR);
				}

			} else {
				return new ResponseEntity<>("file uploaded failed", HttpStatus.INTERNAL_SERVER_ERROR);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
