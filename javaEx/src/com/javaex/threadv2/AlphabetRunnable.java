package com.javaex.threadv2;

// Thread 생성 두번째 방법 : Runnable 인터페이스 구현
public class AlphabetRunnable implements Runnable{

	@Override
	public void run() {
		// Thread 내부의 start 메서드에서 호출된 쓰레드의 로직
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			// 0.3 대기 
			try {
			Thread.sleep(300);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	}
}
