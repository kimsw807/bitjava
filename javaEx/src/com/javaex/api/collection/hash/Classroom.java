package com.javaex.api.collection.hash;

public class Classroom {
	// 필드
	private String roomName;
	private String subject;
	
	// 생성자
	public Classroom(String subject) {
		this.subject = subject;
		
	}
	
	// 두 번째 생성자
	public Classroom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	}
	// toString 오버라이드
	@Override
	public String toString() {
		return "Classroom [roomName=" + roomName + ", subject=" + subject + "]";
	}
	
	// equals, hashCode 오버라이드
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Classroom) {
			return hashCode() == obj.hashCode();
		}
	
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 과목 명이 같으면 같은 해스코드 반환
		return subject.hashCode();
	}
	
	
}
