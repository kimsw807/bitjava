package genericsv1;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
		Box intBox = new Box(); // 가능(Object)
		intBox.setCotent(2020);
		
		//값을 꺼내와 봅니다.
		int content = (int)intBox.getCotent();
		System.out.println("박스의 내용물:" + content);
		
		Box strBox = new Box();
		strBox.setCotent("Java");
		
		// 값을 꺼내와 봅니다.
		String strContent = (String)strBox.getCotent(); // 캐스팅 필요
		System.out.println("박스의 내용물:" + strContent);
		
		// 만약 캐스팅을 잘못하면?
		// 위험하다
		strContent = (String)intBox.getCotent();
		System.out.println("박스의 내용물:" + strContent);
		

	}

}
