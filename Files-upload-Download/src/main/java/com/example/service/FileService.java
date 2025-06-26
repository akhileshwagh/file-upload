package com.example.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	public Boolean uploadFile(MultipartFile file) throws IOException;
	
	public byte[] downloadFile(String file) throws FileNotFoundException, IOException;
}
