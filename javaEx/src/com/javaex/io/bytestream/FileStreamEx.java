package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static String rootPath = System.getProperty("user.dir") +
			"\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";
	public static void main(String[] args) {
		// source-> FIS -> data -> FOS -> target
		try {
			InputStream bis = new FileInputStream(source);
			OutputStream bos = new FileOutputStream(target);
			
			int data = 0; // 저장용 변수
		
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			bos.close();
			bis.close();
			
			System.out.println("파일을 복사했어요!");
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요!");
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
