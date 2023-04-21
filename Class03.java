package days09;

class Human{
	String name;
	int age;
	String phone;
	String address;
}

public class Class03 {

	public static void main(String[] args) {
		Human h1;
		h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		
		String [] name = new String[3];
		int [] age = new int[3];
		String [] phone = new String[3];
		String [] address = new String[3];
		// 멤버변수에 해당하는 항목이 많을수록 배열의 갯수가 늘어납니다
		
		// 클래스를 사용함으로써 자료처리의 단위가 변경됩니다.
		// 프로그램이나 자료 중심의 처리 -> 개발자 중심의 처리!
		
		// 클래스는 변수로 구분
		h3.name = "홍길남"; 
		h3.age = 30;
		h3.phone = "010-1111-2222";
		h3.address = "서울시 마포구 신촌동";
		System.out.println("이름 : " + h3.name + " 나이 : " + h3.age + " 전화번호 : " + h3.phone + " 주소 : " + h3.address);
		
		// 배열은 첨자로 구분
		name[0] = "홍길서";
		age[0] = 31;
		phone[0] = "010-7777-8888";
		address[0] = "서울시 마포구 대흥동";
		
		System.out.println("이름 : " + name[0] + " 나이 : " + age[0] + " 전화번호 : " + phone[0] + " 주소 : " + address[0]);
		
		for(int i = 0; i < name.length; i++) {
			name[i] = "abcd";  // 직접 입력하거나 사용자로부터 입력받거나
			age[i] = 29;
			phone[i] = "010-9999-8888";
			address[i] = "서울시 마포구 창천동";
		}
		// 배열은 이렇게 좋은 장점이 있습니다 이러한 것을 뛰어넘을 수 있을까요?
		
		h1.name = "홍길서";  // 직접 입력하거나 사용자로부터 입력 받거나
		h1.age = 28;
		h1.phone = "010-2222-2222";
		h1.address = "서울시 마포구 신촌로";
		
		h2.name = "홍길북";
		h2.age = 27;
		h2.phone = "010-3333-2222";
		h2.address = "서울시 마포구 신촌로";
		
		// 반복되는 코드는 메서드로 만들어 호출합니다
		// 앞에서 공부한 일반적인 static 메서드가 아닌 클래스 전용 메서드로 생성해서 사용합니다
	}

}
