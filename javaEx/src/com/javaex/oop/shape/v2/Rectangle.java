package com.javaex.oop.shape.v2;

public class Rectangle extends Shape 
	implements Drawable {
	//	x, y 필드, draw, area 메서드 상속
	protected int width;
	protected int height;
	
	//	생성자
	public Rectangle(int x, int y,
			int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.printf(
			"사각형(x=%d, y=%d, area=%f)을 그렸습니다.%n",
			x, y, area());
	}

	@Override
	public double area() {
		return width * height;
	}

}
