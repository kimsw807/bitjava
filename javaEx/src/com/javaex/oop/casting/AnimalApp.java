package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Dog d1 = new Dog("스누피");
		//	객체 참조 형식이 자기자신
		//	갖고 있는 모든 기능을 활용 가능
		d1.eat(); // 상속 받은 메서드
		d1.walk();	//	상속 받은 메서드
		d1.bark();	//	자신만 가진 메서드
		
		Animal d2 = new Dog("두기");
		//	자식 객체를 부모 타입으로 참조하는 것
		//	-> Upcasting
		d2.eat(); // 부모 참조 타입에 있음
		d2.walk(); //	부모 참조 타입에 있음
//		d2.bark();	//	부모 참조 타입에 없음
		//	설계도에 있는 것만 사용가능
		((Dog)d2).bark();
		
		//	교체 가능성(다형성)
//		Dog pet = new Dog("아지");
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		//	새로 애완동물을 입양
		pet = new Cat("아즈라엘");
		pet.eat();
		pet.walk();
		
		//	짖거나 혹은 야옹을 하게 하고 싶다
		//	다운캐스팅시 
		//		가능 여부를 판단 : instanceof 연산자
		if (pet instanceof Dog) {
			//	안전하게 다운캐스팅 가능
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
