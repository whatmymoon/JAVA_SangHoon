package days09;

// 접근지정자
// 모든 클래스의 멤버는 현실에 존재하는 대상의 정보로서,
// 직접적인 접근이 허용되는 것과 허용되면 안되는 정보가 있습니다.
// 접근지정자는 클래스의 멤버들에 대한 접근을 제어하는 키워드 입니다.

// private : 클래스 내부에서만 사용가능한 멤버를 정의하는 키워드
// public : 접근에 제한이 없는 멤버를 정의하는 키워드
// protected : child class 에서만 자유롭게 접근이 가능. 상속단원에서 자세히 학습합니다.
// default : 접근 지정자를 지정하지 않으면 자동으로 갖게되는 접근지정자이며, 같은 패키지내에서 자유롭게 접근 가능합니다.

class Account{  // 은행 계좌 클래스
	
	private double balance;  // 계좌 잔액이 저장될 멤버 변수
	
	// 클래스의 멤버변수 와 멤버 메서드는 접근 지정자(private, public, protected)에 의해서 외부에서의 접근을 조절할 수 있습니다.
	// 접근지정자를 사용하지 않는 경우 기본지정으로 public이 설정되며, 클래스 외부에서 직접접근이 가능합니다.
	// 이는 멤버변수의 값이 무분별하게 수정될 수 있다는 뜻입니다.
	// 이를 방지하고 무분별한 접근을 막기위해 멤버변수에 private을 지정합니다.
	// private 으로 지정된 멤버는 자기자신이 속한 class 내부의 멤버메서드를 통해서만 접근 가능합니다.
	// 멤버 메서드는 대개 public 으로 지정되며, 외부에서 자유로운 접근이 가능합니다.
	
	public void initBalance(int i) {
		balance = i;	
	}

	public void display() {
		System.out.printf("현재 잔액은 %10.2f 원 입니다.\n", balance);
	}

	public void withraw(int i) {
		balance -= i;
		System.out.println(i + "원 출금완료");
	}

	public void deposit(int i) {
		balance += i;
		System.out.println(i + "원 입금완료");
	}
	
	
	
}
public class Class06 {

	public static void main(String[] args) {
		
		Account a = new Account();
		// a.balance = 10000;  // 에러. private 으로 보호되는 멤버변수는 클래스 외부에서 직접 접근 안됩니다. X
		a.initBalance(100000);  // 잔액 초기화
		a.display();  // 화면에 잔액 표시
		a.withraw(5000);  // 출금
		a.display();
		a.deposit(20000);  // 입금
		a.display();
	}

}
