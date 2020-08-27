package genericsv2;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
	//	Box <Integer> = new Box<Integer>(); // 가능(Object)
		Box <Integer> intBox = new Box<Integer>(); // 뒤의 것은 생략 가능
		intBox.setContent(2020); // OK
//		intBox.setCotent("2020"); // 컴파일러가 Generics를 체크
		
		//값을 꺼내와 봅니다.
		// 내부 데이터가 Integer임이 활실 -> 캐스팅 불필요
		int content = intBox.getContent();
		System.out.println("박스의 내용물:" + content);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java"); // 가능(String 타입 지정)
		
		// 값을 꺼내와 봅니다.
		String strContent = strBox.getContent(); // 캐스팅 필요
		System.out.println("박스의 내용물:" + strContent);
		
		// 만약 캐스팅을 잘못하면?
		// 컴파일이 안된다(Generics를 체크)
		/*
		strContent = (String)intBox.getContent();
		System.out.println("박스의 내용물:" + strContent);
		*/

	}

}
