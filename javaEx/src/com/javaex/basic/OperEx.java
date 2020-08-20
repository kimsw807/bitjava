package com.javaex.basic;

//	연산자 연습
public class OperEx {

	public static void main(String[] args) {
		// arithOper();
//		incDecOper();
//		logicalOper();
//		bitOper();
		conditionalOper();
	}
	
	//	3항 연산자
	public static void conditionalOper() {
		//	논리비교 ? 참일때 : 거짓일때
		//	간단한 값의 제어, 코드 가독성을 높일 수 있다
		int a = 10;
		//	a가 짝수면 "짝수", 아니면 "홀수" 문자열
		String message = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println("a는 짝수입니까? " + message);
		
		int score = 70;
		//	점수가 80 이상이면 Good
		//	점수가 50점 이상이면 Pass
		//	그렇지 않으면 Fail
		message = score >= 80 ? "Good" :
			score >= 50 ? "Pass" : "Fail";
		System.out.println("시험 결과:" + message);
		//	중첩 가능하긴 하지만 가독성이 떨어지는 문제
		//	복잡한 비교의 경우는 비교문으로 해결
	}
	
	//	비트 연산자
	public static void bitOper() {
		//	and (&), or (|), not (~)
		//	정수형 데이터를 비트 단위로 제어하는 연산자
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and 연산
		System.out.println(
				Integer.toBinaryString(result));
		
		result = b1 | b2; // bit or 연산
		System.out.println(
				Integer.toBinaryString(result));
		
		result = ~b1;	//	bit not 연산 0 <-> 1
		System.out.println(
				Integer.toBinaryString(result));
		System.out.println(result);
		
		//	비트 시프트
		//		<< : 비트를 왼쪽으로 이동 (정수형 2의 배수의 곱)
		//		>> : 비트를 오른쪽으로 이동 (정수형 2의 배수의 나눗셈)
		
		int val = 1;
		System.out.println(val);
		//	왼쪽으로 1비트 이동
		System.out.println(
				Integer.toBinaryString(val << 1));
		
		val = 0b100;
		//	오른쪽으로 2비트 이동
		System.out.println(
				Integer.toBinaryString(val >> 2));
	}
	
	//	비교, 논리 연산
	public static void logicalOper() {
		//	비교 연산자 >, >=, <, <=
		//		== (같다), != (같지 않다)
		
		//	논리연산자: &&(논리곱:AND)
		//				||(논리합:OR)
		//				!(논리부정:NOT)
		int n = 5;
		//	n은 0초과, 10미만인가?
		//		조건1: n > 0 이고(AND)
		//		조건2: n < 10
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		
		System.out.println("n > 0 and n < 10 ? " + r);
		
		//	n은 0이하이거나, 10이상인가?
		//		조건 1: n <= 0 이거나(OR)
		//		조건 2: n >= 10
		
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		
		System.out.println("n <= 0 or n >= 10 ? " + r);
		
		//	!(논리부정) : 논리값을 뒤집는다 (true <-> false)
		boolean notR = !r;
		System.out.println("논리 부정:" + notR);
	}

	//	증가, 감소 연산자
	public static void incDecOper() {
		//	순서가 중요
		int a = 5; //	a++
		int b = 5;	//	++a
		
		//	후위연산자
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		//	전위 연산자
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
	}
	
	// 산술연산자
	public static void arithOper() {
		//	사칙연산 : +, -, *, /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 => " + (7 / 3));
		//	int / int -> int(몫)
		System.out.println("7 / 3의 몫 => " + (7 % 3));
		//	나머지 연산자 : %
		
		//  정확한 실수값을 얻으려면 int -> float 변환
		System.out.println("7 / 3 실수 => " + 
				((float)a / (float)b));
		
		//	만약 -> 정수를 0으로 나누면
		//	ArithmeticException
		/*
		System.out.println("정수 나누기 0 => " + 
				(a / 0));
				*/
		
		//	실수를 0으로 나눈다
		System.out.println("실수 / 0 => " + (4.0 / 0));
		//	무한대에 산술연산 -> 무한대
		System.out.println("무한대의 산술 => " +
				(4.0 / 0 + 10));
		//	연산 -> 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0 / 0.0 => " +
				(0.0 / 0.0));
		//	NaN 포함된 산술 연산 -> NaN (계산 불가)
		System.out.println("NaN 산술 =>" +
				(0.0 / 0.0 + 20));
		//	유한수인지 확인
		System.out.println("유한수의 확인:" +
				Double.isFinite(4.0 / 0));
		//	NaN인지 확인
		System.out.println("NaN 확인 => " +
				Double.isNaN(0.0 / 0.0));
		
	} 
}
