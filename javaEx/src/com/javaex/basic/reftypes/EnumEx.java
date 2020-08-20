package com.javaex.basic.reftypes;

public class EnumEx {
	public static void main(String[] args) {
//		usingEnum();
		usingEnum2();
	}
	
	public static void usingEnum2() {
		//	요일 정보가 있을 때
		//	SUNDAY -> 휴식
		//	MONDAY ~ THURSDAY -> 열공
		//	FRIDAY -> 불금
		//	SATURDAY -> 늦잠
		
		WeekDay dow = WeekDay.TUESDAY;
		String act;
		
		switch(dow) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "열공";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "늦잠";
			break;
		default:
			act = "?";
		}
		
		System.out.printf("%s에는 %s%n",
				dow.name(), act);
	}
	
	public static void usingEnum() {
		WeekDay dow = WeekDay.TUESDAY;
		
		//	열거형 객체 확인
		System.out.printf("오늘은 %s(%d)입니다%n",
				dow.name(),	//	열거 상수의 문자열 반환
				dow.ordinal()	// 열거 상수의 순번
				);
		
		//	문자열을 -> 열거 상수로
		String str = "SUNDAY";
		WeekDay obj = WeekDay.valueOf(str);
		
		System.out.printf("문자열 %s는 열거상수 %d%n",
				str, obj.ordinal());
	}
}
