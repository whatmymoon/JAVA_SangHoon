package days09;

class Cclass{
	
	private int age;
	Cclass(int age){
		this.age = age;  // 멤버변수 age 와 매개변수 age 를 구분하기 위해 멤버변수 뒤에 this. 을 붙여줍니다
	}  // ( == ) Cclass(int i) { age = i; } // 1-2. 매개변수가 있는 생성자 정의
	
	Cclass(){  // 오버로딩 -> 메서드의 이름은 같지만 쓰여진 자료형 변수 및 수가 달라서 같은이름으로 써도 에러가 나지 않습니다.
		
	}  // 2-2. 디폴트 생성자를 오버로딩하여 추가로 정의합니다.
	
}

class Dclass{
	private int age;
	private String name;
	
	// 마우스로도 생성 가능 -> 오른쪽 버튼(마우스) -> source -> ...
	// 얼마든지 생성자는 오버로딩해서 쓸 수 있다.
	
	public Dclass() {
		super();
	}

	public Dclass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}


public class Class14 {

	public static void main(String[] args) {
		
		Cclass c1 = new Cclass(20);
		Cclass c2 = new Cclass(30);
		// 1-1. 생성자에 전달인수를 만들고 다른 값을 전달하여, 객체마다 멤버변수의 초기값을 달리 하여 생성할 수 있습니다.
		
		Cclass c3 = new Cclass();
		// 2-1. 클래스 내부에 생성자가 꺼내어 져서 매개변수를 사용할 경우, 매개변수가 없는 디폴트 생성자는
		//    새로 생성된 생성자로 "대체"되어져서 없는 생성자가 됩니다. 따라서 위 명령은 에러가 됩니다.
		
		// 3. 디폴트생성자의 오버로딩을 통해 없어진 디폴트 생성자 문제를 해결할 수 있습니다.
	}

}
