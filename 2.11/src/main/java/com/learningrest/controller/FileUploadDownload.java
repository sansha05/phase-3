package com.learningrest.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadDownload {
	
	@RequestMapping(value="/upload", method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String result="file uploaded successfully..";
		
		File fl = new File("D:\\" + file.getOriginalFilename());
		try {
			fl.createNewFile();
			
			FileOutputStream fout = new FileOutputStream(fl);
			fout.write(file.getBytes());
			fout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		
		
		return result;
	}
	
	
	@RequestMapping(value="/download", method=RequestMethod.GET)
	public ResponseEntity<Object> fileDownload(@RequestParam(name="filename") String filename) throws FileNotFoundException {
		File fl = new File("D:\\" + filename);
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(fl));
		
		HttpHeaders header = new HttpHeaders();
		header.add("content-disposition", String.format("attachment; filename=\"%s\"", fl.getName()));
		
		
		return ResponseEntity.ok().headers(header).contentType(MediaType.parseMediaType("application/png")).body(resource);
		
		
	}
	
	
}
