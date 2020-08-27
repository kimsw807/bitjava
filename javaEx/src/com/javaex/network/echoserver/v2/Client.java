package com.javaex.network.echoserver.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// 1. Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다]");
			//	2. 서버 정보 확인
			InetSocketAddress remote =
					new InetSocketAddress("127.0.0.1", // 서버의 IP
							10000); // 서버 포트 정보
			//	3. 서버에 접속 시도
				socket.connect(remote);; // connect 시도
				
				System.out.println("[서버에 연결 되었습니다.}");
				
				// 서버로 메시지 전송 : Stream IO 활용
				// OutputStream 확보
				OutputStream os = socket.getOutputStream();
				Writer osw = new OutputStreamWriter(os, // Main Stream
						"UTF-8"); // 텍스트 인코딩 정보
				BufferedWriter bw = new BufferedWriter(osw);
				
				//	서버로부터 메시지 수신을 위한 InputStream 확보
				InputStream is = socket.getInputStream();
				Reader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				/*
				String message = "테스트 요청 메시지";
				bw.write(message);
				System.out.println("클라이언트 전송 메시지:" + message);
				bw.close();
				*/
				
				// 키보드에서 입력을 받아서 서보로 전송
				BufferedReader keyReader = new BufferedReader(
						new InputStreamReader(System.in));
				
				// /q -> 전송 중지
				while(true) { // 무한 루프
					String message = keyReader.readLine(); // 한 줄 읽기
					
					if(message.equals("/q))")){
						System.out.println("접속을 종료합니다.");
						break;
					}	
						bw.write(message); // 메시지 전송
						bw.newLine(); // 새 라인
						bw.flush(); // 버퍼 비우기
						System.out.println("전송할 메세지:" + message);
						
					// 수신 메시지 확인
					String rcvMsg =	br.readLine();
					System.out.println("수신한 메시지:" + rcvMsg);
				}
				
				
			// 종료
				System.out.println("<클라이언트 종료>");
				
				// 스트립 닫기
				keyReader.close();
				bw.close();
				br.close();
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				socket.close(); // 자원 정리
				;
			}catch(IOException e) {
		
			e.printStackTrace();
	
			}
		}
	}
}