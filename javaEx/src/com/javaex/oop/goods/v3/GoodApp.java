package com.javaex.oop.goods.v3;

//	v3
//	Goods 객체를 생성하여 사용하는 클래스
public class GoodApp {

	public static void main(String[] args) {
		//	Goods 클래스 사용
//		Goods notebook = new Goods(); // 인스턴스화
		//	생성자 활용
		Goods notebook = 
			new Goods("LG Gram", 1500000);
				
		
		//	setter를 이용한 우회 접근
		/*
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		*/
		//	메서드 호출
		notebook.showInfo();
		
		Goods smartphone = 
			new Goods("iPhone SE",
					600000);
		
		/*
		smartphone.setName("iPhone SE");
		smartphone.setPrice(600000);
		*/
		smartphone.showInfo();
	}

}
