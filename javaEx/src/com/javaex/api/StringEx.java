package com.javaex.api;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
//		stringMethods();
		stringBufferEx();
	}
	
	private static void stringBufferEx() {
		//	복잡한 문자열을 가공할 때 매번 새로운 문자열 객체 생성
		//	-> 내부에 버퍼(임시저장공간)를 가진 StringBuffer를 활용하면
		//	메모리 관리에 용이
		StringBuffer sb = new StringBuffer("This"); //	버퍼의 생성 + 초기화
		//	문자열 추가 : append()
		sb.append(" is pencil");
		//	문자열 삽입 : insert()
		sb.insert(8, "my");
		//	문자열 치환 : replace()
		sb.replace(8, 10, "your ");
		
		System.out.println("조합된 문자열:" + sb);
		//	버퍼의 길이를 임의로 변경할 경우
		sb.setLength(100);
		
		//	메서드 체이닝을 이용하여 문자열 조합
		StringBuffer sb2 = new StringBuffer("This")	//	초기화
				.append(" is pencil") // 추가
				.insert(8, "my") // 삽입
				.replace(8, 10, "your ");
		String s = sb2.toString(); // 새로운 문자열이 생성, 할당
		System.out.println("체이닝 조합된 문자열:" + s);
	}
	
	private static void stringMethods() {
		//	중요 메서드 확인
		String s = "Java Programming is Fun?";
		
		//	char 형이 여러 개 연결되있는 형태 
		System.out.println("길이:" + s.length());
		
		//	변환 메서드 : to 계열
		System.out.println("대문자로:" + s.toUpperCase());
		System.out.println("소문자로:" + s.toLowerCase());
		
		//	검색 관련 : 문자, 문자열의 위치 찾을때
		System.out.println("5번 인덱스의 문자: " + s.charAt(5));
		//	중요! indexOf
		System.out.println("Fun 문자열의 위치 인덱스: " 
				+ s.indexOf("Fun"));	// 검색어 대소문자를 구분
		System.out.println("fun 문자열의 위치 인덱스: "
				+ s.indexOf("fun"));	//	-1 -> 찾을 수 없음
		System.out.println("m의 위치 인덱스: " + s.indexOf("m")); // 11
		System.out.println("m의 역방향 위치 인덱스: " + s.lastIndexOf("m"));
		
		System.out.println("m의 위치 인덱스 2nd:" + s.indexOf("m", 12));
		//	검색 시작 위치를 12번 인덱스부터
		
		//	문자열 추출 : substring
		System.out.println("substring (끝까지) : " + s.substring(5));
		System.out.println("substring (범위) : " + s.substring(5, 16));
		
		//	치환
		System.out.println("치환 : " + s.replace('?', '!'));
		System.out.println("모두 치환 : " 
				+ s.replaceAll("Fun", "Funny").replace('?', '!'));
		
		//	변환 메서드를 수행해도 내부 데이터는 변경되지 않는다(중요: immutable)
		System.out.println("원본데이터:" + s);
		
		//	trim() -> 공백문자 제거
		String word1 = "          Hello            ";
		String word2 = ", Java";
		
		String result = word1.trim() + word2.trim();
		System.out.println(result);
//		System.out.println(word1 + word2);
		
		//	문자열 분리 : split
		String[] chunks = s.replace("?", "").split(" "); //	공백을 기준으로 분리 -> 문자열 배열
		System.out.println("조각의 수 : " + chunks.length);
		
		for (String data: chunks) {
			System.out.println("조각: " + data);
		}
		
		//	 문자열의 대소 비교 : 유니코드 값의 대소비교
		//	ABC < ABD
		//	같으면 0, 비교값이 작으면 음수, 비교값이 크면 양수
		System.out.println("ABC".compareTo("ABD"));
	}
	
	private static void stringBasic() {
		String s1 = "Java";	//	리터럴 - 소스 코드에 직접 입력한 데이터
		String s2 = new String("Java"); //	메모리에 새 객체
		String s3 = "Java";	//	리터럴
		
		//	같은 값을 가졌으나 리터럴과 새 객체의 비교
		System.out.println("s1 == s2 ? " + (s1 == s2));
		//	같은 값을 가진 두 개의 리터럴
		System.out.println("s1 == s3 ? " + (s1 == s3));
		
		//	char의 배열을 사용한 문자열의 생성
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println("s4 = " + s4);
		
		//	기본 타입을 문자열 객체로 변환 : valueOf
		String s5 = String.valueOf(Math.PI);
		System.out.println("s5 = " + s5);
	}

}
