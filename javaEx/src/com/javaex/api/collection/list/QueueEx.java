package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 자료형
		// First In First Out (선입 선출)
		// Queue는 인터페이스만 제공
		// 실체 클래스는 List 클래스를 이용
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터의 제공(enqueue) : offer
		for (int i =1; i <= 10; i++) {
			queue.offer(i);
			
		}
		System.out.println("QUEUE:" + queue);

		// 인출 : 방향의 확인
		System.out.println("dequeque:" + queue.poll());// 데이터의 인출
		System.out.println("Queue:" + queue);
		
		System.out.println("peek:" + queue.peek()); // 확인 : 삭제 안함
		System.out.println("Queue:" + queue);
		
		// 전체 데이터의 인출
		// poll 할 때는 isEmpty로 체크 필
		while(!queue.isEmpty()) { // 비어있지 않으면 루프
			System.out.println("POLL:" + queue.poll());
		}
	}

}
