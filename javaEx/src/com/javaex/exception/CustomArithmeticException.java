package com.javaex.exception;

//	ArithmeticException을 확장한 사용자 정의 예외 객체
public class CustomArithmeticException 
	extends ArithmeticException {

	//	필드: 예외 발생 당시의 상황정보(데이터)
	private int num1;
	private int num2;
	
	//	생성자
	public CustomArithmeticException(String message, 
			int num1, int num2) {
		super(message); //	부모 생성자 호출
		this.num1 = num1;
		this.num2 = num2;
	}

	//	Getter / Setter
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}






