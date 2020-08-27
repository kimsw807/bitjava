package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableEx {

	public static void main(String[] args) {
		// Hashtable : Map 형자료형
		// key - 값의 쌍으로 데이터를 관리
		// key는 중복 될 수 없음(*)
		Hashtable<String, Classroom> map = new Hashtable<>();
		
		// 데이터 넣기
		map.put("101",  new Classroom("Java", "R101"));
		map.put("202", new Classroom("C" ,"R202"));
		map.put("303", new Classroom("Python", "R303"));
		map.put("404", new Classroom("Linux", "R404"));
		
		System.out.println("MAP:" + map); //순서가 없다
		
		// 데이터 가져오기: get
		System.out.println("303강의실의 강의:" + map.get("303"));
		
		// 데이터 변경: put (이미 있는 키면 데이터 덮어쓰기)
		map.put("202",  new Classroom("C#", "R202"));
		System.out.println("MAP:" + map);
		
		// 키가 있는지 확인 : contaninsKey()
		System.out.println("키에 202가 있는가?" + map.containsKey("202"));
		System.out.println("키에 501이 있는가?" + map.containsKey("501"));
		
		// 값의 검색
		System.out.println("Java:" + map.containsValue("Java"));
		System.out.println("Java 강의 포함?:" + 
				map.containsValue(new Classroom("Java")));
		// hashCode, equals가 적절히 오버라이드 되어 있어야 정상 작동
		
		//	Iterator를 이용한 자료의 순회
		Iterator<String> it = map.keySet().iterator();
		
		// 순회
		while(it.hasNext()) { // 뒤에 내용이 더 있는가?
			Classroom room = map.get(it.next()); // 키를 이용한 데이터 추출
			
			System.out.println("강의실:" + room);
		}
		
		// 맵 주우기
		map.clear();
		System.out.println("MAP:" + map);
				
		
	}

}
