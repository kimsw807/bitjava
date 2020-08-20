package com.javaex.oop.staticmembers;

//	Singleton Pattern
//	어떤 상황에서도 반드시 1개의 인스턴스를 
//		유지해야 하는 경우
public class Singleton {
	//	인스턴스를 static으로 선언
	private static Singleton instance =
			new Singleton();
	//	생성자 
	private Singleton() {
		//	절대 두번 호출되면 안된다
	}
	
	//	일종의 getter를 만들어서 우회 접근
	public static Singleton getInstance() {
		return instance;
	}
}
