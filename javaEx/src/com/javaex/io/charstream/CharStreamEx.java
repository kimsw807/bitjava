package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String rootPath = System.getProperty("user.dir") +
			"\\files\\";
	static String filename = rootPath + " char.txt";
	
	public static void main(String[] args) {
		// Writer : Char 출력 Stream의 최고 조상
		try {
			
			Writer fw = new FileWriter(filename);
			// 출력
			fw.write("Bit Computer\r\n");
			fw.write("Java Programming\r\n");
			fw.write("2020.08\r\n");
			
			// 버퍼 지우기
			fw.flush();
			fw.close();
			
			System.out.println("파일 저장 완료!");
			
		//	파일 읽어오기
			Reader fr = new FileReader(filename);
			
			int data = 0; // 데이터 저장 변수
			while((data = fr.read()) != -1){
				//실제 데이터는 char -> 다운캐스팅
				System.out.print((char)data);
			}
			fr.close();
			System.out.println("파일 읽기 완료!");
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요");
		} catch (IOException e) {
			e.printStackTrace();
		}
			}

}
