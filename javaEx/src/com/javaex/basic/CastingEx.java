package com.javaex.basic;

//	데이터 타입을 다른 데이터 타입으로 변경 (Casting)
//	1. 좁은 표현 범위 데이터 -> 넓은 표현 범위 데이터 (Promotion)
//	2. 넓은 표현 범위 데이터 -> 좁은 표현 범위 데이터 (Casting)
public class CastingEx {

	//	자료형의 크기
	//	byte(1) < short(2) < int(4) < long(8)
	//		<< float(4) < double(8)
	public static void main(String[] args) {
//		promotionEx();
		castingEx();
	}
	
	public static void castingEx() {
		//	explicit casting(명시적 변환)
		//	표현 범위 넓은 타입 -> 좁은 타입으로의 변환
		//	자료의 유실 발생 가능 (중요)
		//	개발자가 명시적으로 변환할 자료형을 지정
		float f =1234.5678F;
		System.out.println("float:" + f);
		
		long l = (long)f;
		System.out.println("-> long:" + l);
		
		byte b = (byte)l;
		System.out.println("-> byte:" + b);
		
	}
	
	public static void promotionEx() {
		//	implicit casting(암묵적 변환)
		//	표현 범위가 좁은 타입 -> 넓은 타입으로의 변환
		byte b = 25; //	1바이트 정수형
		System.out.println("바이트 :" + b);
		
		short s = b; //	2바이트 정수형
		System.out.println("short:" + s);
		
		int i = s; //	4바이트 정수형
		System.out.println("int:" + i);
		
		long l = i; //	8바이트 정수형
		System.out.println("long:" + l);
		
		float f = l; 	// 4바이트 실수형 
		//	바이트 수는 적지만 표현범위가 float > long
		System.out.println("float:" + f);
		
		//	double
	}

}
