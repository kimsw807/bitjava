package com.javaex.oop.point.v3;

//	v3. 
//	메서드 오버로딩
public class Point {
	//	필드 
	private int x;
	private int y;
	
	//	사용자 정의 생성자가 있을 경우
	//	JVM은 기본생성자를 만들지 않는다
	public Point() {
		
	}
	//	사용자 정의 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//	getters/setters
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	메서드
	public void draw() {
		System.out.printf(
				"점 (%d, %d)을 그렸습니다.%n", 
				x, y);
	}
	
	//	메서드 오버로딩
	//	같은 리턴 타입과 같은 이름을 가졌지만
	//	매개변수의 종류, 갯수, 순서만 다른 메서드
	public void draw(boolean show) {
		//	show : true -> 그렸습니다.
		//			false -> 지웠습니다.
		//	3 항 연산의 활용
		String message = 
				show ? "그렸습니다":"지웠습니다";
		//	TODO: -> if 문 버전으로 해보기
		System.out.printf(
			"점 (%d, %d)을 %s%n", 
			x, y, message);
	}
}
