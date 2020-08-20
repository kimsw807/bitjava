package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		//	추상 클래스는 new로 생성할 수 없음
//		Shape s = new Shape();
		
		Circle c = new Circle(10, 20, 30);
		c.draw();
		
		Rectangle r = new Rectangle(10, 20, 100, 30);
		r.draw();
	}

}
