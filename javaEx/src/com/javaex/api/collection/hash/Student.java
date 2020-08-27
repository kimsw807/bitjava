package com.javaex.api.collection.hash;

// Hash 계열 자료형이 객체의 동등성을 비교하는 방법
// 1. hashCode와 비교
// 2. equals를 이용한 값의 비교
// 이 두가지를 모두 통과 해야 동등 객체로 인정
public class Student {
	// 필드
	private int code;
	private String name;
	
	// 생성자
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}

	// hashCode, equals 메서드 오버라이드: 매우 중요
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
			// 체크 후 다운 캐스팅
			if (obj instanceof Student) {
				Student other = (Student)obj; // 다운 캐스팅
			return name.equals(other.name) && code == other.code; 
		}
			return super.equals(obj);
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return code;
	}
	

	
	
	
	

}
