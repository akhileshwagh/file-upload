package com.example.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.service.FileService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
			
			HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.parseMediaType(contentType));
			//headers.setContentLength(file.length());
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

}
