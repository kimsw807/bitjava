package com.javaex.oop.goods.v3;

//	v3
//	생성자 연습
public class Goods {
	//	필드(속성)
	private String name;
	private int price;
	
	//	생성자는 반드시 1개 이상 있어야 한다
	//	코드상에 생성자 코드가 하나도 없으면 
	//		기본 생성자를 강제로 추가한다
	
	public Goods(String name, int price) {
		//	리턴 타입은 없고
		//	클래스 이름과 동일한 이름
		this.name = name;
		this.price = price;
	}
	
	//	Getter / Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//	this : 해당 인스턴스 자신을 가리키는
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	메서드
	public void showInfo() {
		//	내부 필드의 정보를 출력
		System.out.printf("%s, 가격 %d원%n", 
				name, price);
	}
}





