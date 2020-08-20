package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(); // 인스턴스화
		p1.setX(10);
		p1.setY(20);
		
		Point p2 = new Point();
		p2.setX(20);
		p2.setY(30);
		
		p1.draw();
		p2.draw();
	}

}
