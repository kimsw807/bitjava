package com.javaex.thread.synchronize;

public class User extends Thread{
	// 필드
	private SharedMemory memory;
	private int data;
	
	// 생성자
	public User(String name,
			SharedMemory memory,
			int data) {
		this.setName(name);
		this.memory = memory;
		this.data = data;
	}
	


	@Override
	public void run() {
		if (memory != null) {
			memory.setMemory(data);
		}

	}
}