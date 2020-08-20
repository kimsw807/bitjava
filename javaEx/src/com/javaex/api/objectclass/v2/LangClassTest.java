package com.javaex.api.objectclass.v2;

//	v2. equals 테스트
public class LangClassTest {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(
				"s1 == s2 ? " + (s1 == s2)); //	동일 객체 ?
			
		System.out.println(
				"s1.equals(s2) ? " + s1.equals(s2)); //	값이 같은지?
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println("p1 == p2 ? " + (p1 == p2));
		System.out.println("p1.equals(p2) ? " + p1.equals(p2));
		
	}
	
	

}






