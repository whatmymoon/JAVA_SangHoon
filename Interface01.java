package days14;

// 자바 언어에서 제공하는 상속 기능은 단일 상속만을 지원합니다.
// 하나의 클래스는 하나의 부모클래스를 가질 수 있습니다. (여러개의 클래스를 상속할 수 없음)
// class SubA extends SuperA, SuperB {}-> 에러
// 위 내용을 상속의 상속을 거처서 구현은 가능합니다.
// class SuperA extends SuperB{}
// class SubA extends SuperA{ }

// 다중 상속을 위해 만들어진 interface
// 1. 인터페이스도 클래스 입니다. 다만 제약이 있는 클래스입니다.
// 2. 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있습니다.
// 3. 일반 멤버변수와 일반 멤버메서드를 가질 수 없습니다.
// 4. 인터페이스는 멤버메소드로 public abstract 메서드만 가질 수 있습니다.
// 5. 추상클래스보다 더 상속을 위해서 만들어진 클래스 입니다.
// 6. 다중 상속이 가능합니다.

// class 만들 듯이 생성하며, class 란 키워드 대신 interfce 라는 키워드를 써서 생성합니다.
interface InterA{
	int n1 = 1;
	// 일반 멤버 변수는 만들지 못합니다.
	// static final 이라는 말이 없어도 static final 변수로 만들어집니다.
	// final 변수는 생성시에 반드시 초기값이 있어야 그 값으로 고정됩니다.
	
	// InterA(){}  // 에러 - 생성자를 갖을 수 없습니다.
	// public void point(){} // 에러 - 일반 메서드를 생성하지 못합니다.
	
	// 인터페이스 내에 생성 가능한 멤버들
	public static final int num = 10;  // 값이 초기화된 static final
	public abstract void test();  // 추상 메서드
}

// 인터페이스를 상속(구현)하는 클래스는 상속(구현)할 클래스 앞에 extends 대신 implements 를 씁니다.
class SubA implements InterA{
	@Override
	public void test() { 
		System.out.println("Sub클래스의 test 메소드 실행");
	}
	
}

public class Interface01 {

	public static void main(String[] args) {
		
		// InterA a = new InterA();  에러 - 생성자가 없어서 객체를 만들 수 없습니다.
		// 추상클래스에는 생성자가 존재합니다. 그러나 추상메서드때문에 객체 생성은 안됩니다.
		
		// 인터페이스는 상속을 통한 다형성 구현에만 인터페이스가 활용됨.
		// 부모 인터페이스의 레퍼런스를 사용하여 자식 클래스의 객체를 참조 가능
		InterA a1 = new SubA();
		a1.test();  // 부모 참조 변수로 오버라이딩된 메서드 실행
		
		SubA a2 = new SubA();
		method1( a2 );
		
				
		
	}
	
	public static void method1(InterA a) {  // 매개변수로 부모 참조변수 사용
		a.test();
	}

}
