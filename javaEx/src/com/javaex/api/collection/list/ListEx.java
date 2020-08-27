package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListEx {

	public static void main(String[] args) {
		/*
		List<String> linkedList = new LinkedList<>();
		listEx(linkedList);
	*/
		// List(인터페이스)에는 실제 구현과는 별도로 List에서 처리해야 할
		// 기능의 목록이 선언만 되어 있다
		// 실체 클래스에서는 인터페이스를 구현한 실제 로직이 담겨 있다
		List<String> arrayList = new ArrayList<>();
		listEx(arrayList);

	}
	
	private static void listEx(List<String> list) {
		// List는 인터페이스 -> 실체 클래스는 교체 가능
		// 객체의 추가 : add 
		list.add("Java"); // 리스트이 맨 마지막에 새 객체 추가
		list.add("C");
		list.add("C++");
		list.add("Python");
		
		System.out.println(list);
		// 객체의 삽입 : add(index, 객체)
		list.add(2, "C#"); // 2번 인덱스에 "C#"을 삽입
		System.out.println("삽입:" + list);
		
		// List는 중복 삽입을 허용
		list.add("Java");
		System.out.println("중복 삽입:" + list);
		
		// 삭제 
		// 1. 인덱스를 이용한 삭제
		list.remove(2); // 2번 인덱스의 객체 삭제
		System.out.println("인덱스 삭제:" + list);
		// 2. 객체를 지정한 삭제
		list.remove("Python");
		System.out.println("객체 삭제:" + list);
		
		// 객체의 순회 : 내부 객체를 돌면서 하나씩 뽑아내기
		// List와 Set 등에서는 Iterator를 추출하여 순회
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { // 뒤에 연결된 노드가 있는지 확인
			String item = it.next(); // 내부 객체의 추출
			System.out.println("노드 데이터:" + item);
		}
		
		// 비워 봅시다
		list.clear();
		System.out.println("리스트:" + list);
		
	}

}
