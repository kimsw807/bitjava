package com.javaex.oop.staticmembers;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		//	생성자 private -> new 안됨
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//	s1의 주소와 s2의 주소가 같은가?
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		//	주소의 비교 ==
		System.out.println(
			"s1과 s2는 같은 객체? " + (s1 == s2));
	}

}




