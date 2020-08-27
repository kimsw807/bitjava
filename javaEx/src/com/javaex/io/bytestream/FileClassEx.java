package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir")// 프로젝터 DIR
			+"\\files\\";

	public static void main(String[] args) {
		// rootPath 내부의 정보 확인
		File root = new File(rootPath);
		// 실제로 있는 파일인지 확인
		System.out.println("rootPath exists ?" + root.exists());
		
		// 디렉터리 만들기
		if (!root.mkdirs()); {
			root.mkdirs();
		}
		
		//파일의 정보 확인
		printFileINfo(root);
		
		// 디렉토리 내부의 파일을 생성
		File file = new File(rootPath + "myFile.txt");
		if (!file.exists()) { // 파일이 없으면
			// 생성
			try {
			file.createNewFile(); // 실제 파일 생성
			System.out.println("파일 생성!");
			} catch (IOException e) {
				System.err.println("파일을 생성하지 못했어요!");
			}
			
		}
		printFileINfo(root);
		
		// 파일 삭제
		file.delete(); // myFile.tst 삭제
		printFileINfo(root);
		
	}

	private static void printFileINfo(File f) {
		System.out.println("----------");
		
		// 이 파일이 디렉터리 인가?
		if (f.isDirectory()) {
			// 내부 파일 목록 확인
			System.out.println("Directory:" + f.getName());
			// 목록 확인
			File[] files = f.listFiles();
			
			for(File file: files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.printf("%s - %d%n", file.getName(), file.length());
			}
		} else
		// 파일이 아니면
			System.out.println("File:" + f.getName());
		}
}

