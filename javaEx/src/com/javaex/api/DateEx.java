package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스와 Calender 클래스를 연습
public class DateEx {

	public static void main(String[] args) {
		// 날짜 데이터의 획득
		Date now = new Date(); // 현재 날짜와 시간
		String nowStr = now.toString(); 
		
		System.out.println("현재 날짜:" + nowStr);
		System.out.println("현지화된 날짜:" + now.toLocaleString());
		// Deprecated된 메서드는 사라질 메서드 -> 다른 방식으로 교체 필수
		
		// 형식화된 출력 : DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full 포맷:" + df.format(now));
		// FULL, LONG, MEDIUM, SHORT
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG 포맷:" + df.format(now));
		// MEDIUM, SHORT 포맷으로 현재 날짜를 출력해 봅시다
		
		// 자유로운 날짜 데이터 포매팅
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF : " + sdf.format(now));
		

	}

}
