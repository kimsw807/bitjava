package com.javaex.oop.shape.v2;

//	직접적인 상속 관계가 없는 다른 객체들 사이에 
//	같은 기능을 수행할 수 있도록 규약을 제공하는 기능
public interface Drawable {
	public void draw();
	//	실제 구현은 구현한 자식 객체어서 구현
}
