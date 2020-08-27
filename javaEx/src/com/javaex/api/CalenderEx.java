package com.javaex.api;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		// Calendar 얻기: getInstance()
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		// 날짜 정보의 변경
		custom.set(1999, 11, 31); // 12월 31일
		
		// 상수가 많다
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH) +1; // 주의 : 0부터 시작
		int nowDate = now.get(Calendar.DATE);
		
		System.out.printf("오늘 %d년 %d월%d일%n", 
				nowYear, nowMonth, nowDate);

		// 날짜의 연산
		// 10년 뒤롤 이동
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR,10);
		System.out.printf("10년후: %d년%d월%d일%n",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) +1, //0부터 시자기 +1
				future.get(Calendar.DATE)
				);
		// 이 날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("10년 후 오늘의 요일:" + dow);
		
		String dowStr;
			switch(dow) {
			case Calendar.SUNDAY:
				dowStr = "일요일";
				break;
			case Calendar.MONDAY:
				dowStr = "월요일";
				break;
			case Calendar.TUESDAY:
				dowStr = "화요일";
				break;
			case Calendar.WEDNESDAY:
				dowStr = "수요일";
				break;
			case Calendar.THURSDAY:
				dowStr = "목요일";
				break;
			case Calendar.FRIDAY:
				dowStr = "금요일";
				break;
			case Calendar.SATURDAY:
				dowStr = "토요일";
				break;
			default:
				dowStr = "??";
			}
		System.out.println("10년 후 오늘은" + dowStr);
			}
	}


