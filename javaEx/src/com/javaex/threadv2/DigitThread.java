package com.javaex.threadv2;

// Working Thread를 만드는 방법 1
// Thread 상속 구현
public class DigitThread extends Thread{

	@Override
	public void run() {
		// Thread의 로직을 run 메서드를 오버라이드 하여 추가
		// 주의: run메서드를 직접 호출하면 멀티 스레드가 아님
		//		star 메서드를 이용하여 우회 접근
		// 숫자를 0부터 30까지 1증가 츨력, 0.3초 대기
		for (int i = 0; i<= 30; i++) {
			System.out.printf("%s:%d%n",
					getName(), i);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

}
