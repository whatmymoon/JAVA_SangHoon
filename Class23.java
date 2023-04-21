package days10;

// static 변수는 클래스 내부에 존재하지만, 객체 생성과 상관없이 프로그램 시작 전 한번만 생성되고,
// 프로그램 종료시까지 변수가 갖는 값을 일관되게 유지 또는 변경 관리합니다.
// 가장 쉽게 활용하는 방법 : 일정 interval 의 일련번호, 생성된 객체의 갯수, 일관된 지표를 나타내는 기준값

class StaticB{
	int bunho;
	static int count = 0;
	StaticB(){
		// 같은 클래스 내부에서는 static 변수도 클래스이름을 붙이지 않고 사용합니다. 외부에서는 클래스이름을 붙여야 합니다.
		count++;  // 생성자에서 실행되므로, 객체가 생성될 때마다 ++ 연산이 실행됩니다.
		bunho = count;
	}
}
public class Class23 {

	public static void main(String[] args) {
		
		System.out.printf("count 값 = %d\n", StaticB.count);  // 객체 생성하지 않고도 StaticB안에 static 멤버변수의 값을 출력할 수 있다.
		StaticB b1 = new StaticB();  // 객체 생성하면 동적 멤버변수의 값을 바꿀 수 있다.
		System.out.printf("b1.bunho = %d, count = %d\n", b1.bunho, StaticB.count);
		
		StaticB b2 = new StaticB();
		System.out.printf("b2.bunho = %d, count = %d\n", b2.bunho, StaticB.count);
		
		StaticB b3 = new StaticB();
		System.out.printf("b3.bunho = %d, count = %d\n", b3.bunho, StaticB.count);
		
	}

}
