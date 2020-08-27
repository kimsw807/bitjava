package com.javaex.threadv3;

// Process : 실행중인 하나의 프로그램
// Thread : Process 내에서 실행되는 하나의 작업 흐름
// 하나의 Process가 실행되면 MainThread가 하나 생성
public class MainThread {

	public static void main(String[] args) {
		// 메인 스레드와 별도로 다른 작업흐름이 필요
		// Thread 생성하여 실행
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		// 쓰레드의 시작 : Runnable -> Running
		thread1.start(); // thread 내부의 run 메서드는 직접 호출하지 않음
		
		// Runnable을 이용한 작업 Thread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		// Thread 실행 우선순슁 : 자원이 부족할 경우 먼저 수행해야 할 Thread의 순위
		// 1(MIN_PRIORITY) ~ 10(MAX_PRIORITY) - 일반적 우선순위는 5
		thread1.setPriority(Thread.MIN_PRIORITY); // 상수 : 1
		thread2.setPriority(Thread.MAX_PRIORITY); // 상수 : 10
		// 메인 스레드가 종료되면 Working 쓰레드들을 통제할 수 없게 되므로
		// 작업 스레드의 흐름을 메인 스레드의 흐름에 합류
		
		try {
			thread1.join(); // 메인 메서드 흐름에 합류
			thread2.join(); // 메인 메서드 흐름에 합류
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 메인 스레드의 로직
		System.out.println("메인쓰레드 종료");
		
	}
	}
	
