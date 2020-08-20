package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		//	추상 클래스는 new로 생성할 수 없음
//		Shape s = new Shape();
		
		Circle c = new Circle(10, 20, 30);
//		c.draw();
		printObject(c);
		
		Rectangle r = new Rectangle(10, 20, 100, 30);
//		r.draw();
		printObject(r);
		
		Point p = new Point(100, 200);
		printObject(p);
		
		//	인터페이스를 참조 타입으로 설정할 수 있다.
		Drawable d = c;
		
		//	instanceof 연산자로 실제 객체의 인터페이스를 확인할 수 있다.
		if (r instanceof Drawable) {
			//	인스턴트 타입으로의 변환 가능
			((Drawable)r).draw();
		}
	}
	
	private static void printObject(Drawable obj) {
		//	Point와 Circle, Rectagle은 같은 상속 관계에 있지 않지만
		//	인터페이스가 동일하므로 같은 그룹으로 묶을 수 있다.
		obj.draw();
		
	}

}
