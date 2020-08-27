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
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	// 필드 : 통신을 위한 소켓
	private Socket socket;
	
	// 생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
		
	}
	// run 메서드 오버라이드
	@Override
	public void run() {
		// 클라이언드 접속 이후에 로직
		try {
			InetSocketAddress client = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다]");
			System.out.println(client.getAddress() + ":" + 
					client.getPort());
			// 클라이언트로부터 메시지 수식
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// Echo Back을 위한 OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			// 메시지 읽기
			String message;
			while((message = br.readLine()) != null) {
				System.out.println("수신 메시지:" + message);
				// Echo Back
				
				System.out.println("Echo Back:" + message);
				bw.write("[Echo]:" + message);
				bw.newLine();
				bw.flush();
			}
			
			//	후처리
		//System.out.println("[접속이 종료되었습니다]");
			//System.out.println("==========");
			//System.out.println("<서버 종료>");
			System.out.println("클라이언트 접속 해제");
			// 스트림 닫기
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
}
