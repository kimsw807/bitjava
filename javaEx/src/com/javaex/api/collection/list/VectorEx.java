package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("vector:" + v);

		System.out.printf("size: %d, capacity: %d%n",
				v.size(), v.capacity());
		// 1부터 10까지 값을 담아 봅니다.
		for (int i =1; i<= 10; i++){
			v.addElement(i); //추가
			// v.addElement(Integer.valueof(i);
			
		}
		System.out.printf("size: %d, capacity: %d%n",
				v.size(), v.capacity());
		
		// 객체의 삽입 inserElement
		v.insertElementAt(5, 7); // 5객체를 7번 인덱에 추가
		System.out.println("vector:" + v);
		
		// 특정 인덱에 있는 객체를 반환 : elementAt
		int value = v.elementAt(7);
				System.out.printf("%d번 인덱스의 객체 %d%n", 7, value);
		
		// 객체 인덱스 검색 index Of
				
		System.out.println("객체 7의 인덱스?" + v.indexOf(7));
		// 없는 객체의 검색 : -1인덱스
		System.out.println("없는 객체의 인덱스?" + v.indexOf(0));
		
		//객체의 삭제 : removeElement
		v.removeElement(10); // 객체 10을 삭제
		System.out.println("vector:" + v);
		
		// 버퍼 비우기
		v.clear(); //내부 버퍼 비우기
		System.out.println("vector:" + v);
		System.out.printf("size: %d, capacity: %d%n",
				v.size(), v.capacity()); //늘어난 버퍼는 유지
		
		// Generics의 활용
		// Number 클래스을 부모로 가진 모든 자식 클래스를 제네릭으로 제한
		
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(2020));
		v2.addElement(Float.valueOf(3.14159f));;
		//v2.addElement(Boolean.valueOf(true)); //Number의 자식이 아님
		
		// Enumeration을 이용하여 항목을 차례대로 꺼낼 수 있다
		Enumeration<? super Number> e = v2.elements();
		
		while(e.hasMoreElements()); { //뒤에 데이터가 더 있는지?
		
			System.out.println("요소:" + e.nextElement());
			
		}
		
		
	}

}
