package com.example.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.model.Product;

public interface FileService {
	public Boolean uploadFile(MultipartFile file) throws IOException;
	
	public byte[] downloadFile(String file) throws FileNotFoundException, IOException;
	
	public Boolean saveProduct(Product product);
	
	public String uploadFileWithData(MultipartFile file) throws IOException;
}
