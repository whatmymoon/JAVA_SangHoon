package days14;

interface InterB{
	// 인터페이스 내에 선언되는 멤버 변수 : static final
	public static final int n1 = 1;
	public static final int n2 = 2;
	// 인터페이스 내부에 선언되는 멤버 필드는 public static final 을 생략할 수 있습니다.
	int n3 = 3;  // static fainl 변수는 반드시 선언시점에 값이 초기화되어야 에러가 없습니다.
	
	// 인터페이스 내에 선언되는 멤버 메서드 : abstract
	public abstract void test1();
	public abstract void test2();
	// 인터페이스 내부에 선언되는 메서드는 public abstract 을 생략 할 수 있습니다.
	void test3();
	
}


public class Interface02 {

	public static void main(String[] args) {
		
		
		
		
		
	}

}
