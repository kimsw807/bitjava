package com.javaex.thread.synchronize;

// 객체를 공유하는 작업 쓰레드의 경우,
// 임계 영역을 적저히 제어 해 줘야 한다(중요)
public class MainThread {

	public static void main(String[] args) {
		// 공유 객체
		SharedMemory memory = new SharedMemory();
		User user1 = new User("철수", memory, 100);
		user1.start();
		
		User user2 = new User("영회", memory, 200);
		user2.start();
	}
}
