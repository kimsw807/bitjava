package com.javaex.oop.casting;

public class Dog extends Animal {
	//	name 필드와 eat, walk 메서드를 상속
	
	//	생성자
	public Dog(String name) {
		//	1. 부모의 생성자는 반드시 호출
		//	2. 부모 생성자를 명시하지 않으면
		//		부모 기본 생성자 끼워넣는다
		super(name);
	}
	
	//	자신만의 메서드
	public void bark() {
		System.out.println(name + ": 멍멍!");
	}
}



