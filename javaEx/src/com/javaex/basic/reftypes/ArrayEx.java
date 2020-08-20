package com.javaex.basic.reftypes;

public class ArrayEx {
	public static void main(String[] args) {
//		arrayBasic();
//		arrayMemoryTest();
//		arrayNDim();
//		arrayCopy();
		arrayCopySystem();
	}
	
	public static void arrayCopySystem() {
		//	System 객체를 이용한 배열의 복사
		int scores[] = {90, 80, 70};
		int target[] = new int[10];
		
		System.arraycopy(scores,	//	원본 배열
				0,	//	원본 배열 복사 시작 인덱스
				target,	//	대상 배열
				3,	//	대상 배열 내 복사 시작 인덱스
				scores.length);	//	복사할 내용의 길이
		
		//	loop 돌리면서 내용을 확인
		//	Enhanced for
		
		for (int value: target) {
			System.out.print(value + " ");
		}
		System.out.println(); // 개행
	}
	
	public static void arrayCopy() {
		//	배열은 크기 변경이 안되기 때문에
		//	추가내용이 있을 경우 새배열 생성 후 복사
		int scores[] = {90, 80, 70};
		//	공간 7개 추가
		int target[] = new int[10];
		
		//	루프 복사
		for (int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();// 개행
	}
	
	public static void arrayNDim() {
		//	2차원 배열로 연습
		int[][] twoDim = new int[3][5];	//	3행 5열
		
		//	기본 데이터가 있을 경우
		int table[][] = {
				{1, 2, 3, 4, 5},	//	1행
				{2, 3, 4, 5, 1},
				{3, 4, 5, 1, 2}
		};	//	3행 5열의 배열
		
		System.out.println("table.length:" + table.length);
		//	table[0] ~ table[tabel.length - 1]
		System.out.println("table[0].length:" + table[0].length);
		
		//	루프를 돌면서 해당 배열 내부의 모든 값을 합산
		int sum = 0;	// 합산 변수
		for (int row = 0; row < table.length; row++) {
			//	행 루프
			int subtotal = 0;
			for (int col = 0; col < table[row].length; col++) {
				//	열 루프
				subtotal += table[row][col]; //	row행 col열
			}
			System.out.printf("%d행의 합산:%d%n", 
					row, subtotal);
			sum += subtotal;
		}
		System.out.println("총합:" + sum);
		
	}
	
	public static void arrayMemoryTest() {
		//	참조자료형은 메모리의 구조를 잘 이해해야 함
		int scores[] = {
			80, 90, 100, 70	
		};
		
		int scores2[] = scores;
		System.out.println("scores2 길이:" + scores2.length);
		System.out.println("scores2의 0번 방:" + scores2[0]);
		
		System.out.println("scores와 scores2는 같은 객체? " + 
				(scores == scores2));	//	주소 비교
		scores[0] = 100;	//	scores 배열을 변경
		System.out.println("scores2의 0번 방:" + scores2[0]);
	}
	
	public static void arrayBasic() {
		//	문자열 배열 : names -> 선언한 후 초기화
		//	float 배열 : heights -> 선언과 동시에 값
		//	int 배열 : scores -> 빈배열 생성 후 채우기
		String[] names;	//= String names[]
		int scores[];	//= int[] scores
		
		//	초기화
		names = new String[] {
			"홍길동",
			"장길산",
			"전우치",
			"임꺽정"
		};
		
		//	생성시 미리 배열의 값이 있다면
		float heights[] = {
			175.3f,
			170.2f,
			165.3f,
			185.3f
		};	// 생성과 동시에 할 경우만 가능
		
		//	빈 배열 생성후 값을 설정
		scores = new int[4];
		//	인덱스 접근 : 0부터 시작
		//	길이 : .length
		//	* 마지막 인덱스 == .length - 1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;	// 인덱스 에러
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%.2f) : 점수 = %d%n",
					names[i], heights[i], scores[i]);
		}
	}
}
