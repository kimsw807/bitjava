package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(); // 기본생성자 사용
		p1.setX(10);
		p1.setY(20);
		
		Point p2 = new Point(20, 30);	// 사용자 생성자 사용
		
		p1.draw();
		p2.draw();
		
		//	오버로딩된 메서드의 활용
		p1.draw(false);
		p2.draw(false);
	}

}
