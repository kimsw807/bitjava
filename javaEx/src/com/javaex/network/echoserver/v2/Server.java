package com.javaex.network.echoserver.v2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// v2. 멀티 Thread 버전의 Echo Server
public class Server {


	public static void main(String[] args) {
		// 1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			// 2. bind (주소, 포트 연결
			InetSocketAddress local =
					new InetSocketAddress("127.0.01",// localhost
							10000); // PORT
			serverSocket.bind(local); //bind
			
			System.out.println("<서버시작>");
			System.out.println("[연결을 기다립니다.]");
			// 3. 접속 대기 : 여러 클라이언트의 접속을 허용
			Socket socket = serverSocket.accept();
				// 새 서버 쓰레드를 만들어소 로직을 수행
			Thread thread = new ServerThread(socket);
					thread.start();
		
	} catch (IOException e) {
		e.printStackTrace();
	} finally{
		
			// 서버 소켓 닫기
			try {
			serverSocket.close();
		}catch (IOException e) {
			e.printStackTrace();
		
		
		}
}
}
}