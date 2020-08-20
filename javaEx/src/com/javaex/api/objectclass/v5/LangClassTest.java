package com.javaex.api.objectclass.v5;

//	v5. 참조 타입필드를 가진 클래스의 깊은 복제 테스트(코드 수정 없음)
public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {
				10, 20, 30, 40
		});
		System.out.println("s1 = " + s1);
		
		//	복제
		Scoreboard s2 = s1.getClone();
		System.out.println("s2 = " + s2);
		
		//	두 객체는 같은 객체인가?
		System.out.println("s1 == s2 ? " + (s1 == s2));
		//	내부 참조 타입은 같은 객체인가?
		System.out.println("s1.scores == s2.scores ? " + 
				(s1.getScores() == s2.getScores()));
		//	객체 복제되고 내부 참조 필드도 복제되어 분리되었다 (깊은 복제)
	}
	
	

}






