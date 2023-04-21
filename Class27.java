package days10;

class Mymath{
	int a, b;
	static int c = 0;
	// 인스턴스 메서드에서 static 멤버변수에 접근이 가능합니다. o
	Mymath(){
		c++;
	}
	public void init() {
		a = c * 20;
		b = c * 30;
	}
	
	// 인스턴스 메서드에서는 인스턴스 멤버변수에 접근이 가능합니다. o
	public int add() {
		return a + b;
	}
	
	public int subtract() {
		return a - b;
	}
	
	public int multiply() {
		return a * b;
	}
	
	public double divide() {
		return a / (double)b;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// static 메서드에서는 인스턴스 변수에 접근이 불가능합니다.
	// static 메서드에서는 static 변수에 접근이 가능합니다.
	public static int add(int d, int e) {  // 새로운 전달인수를 받아서 더해준다.
		return (d + e) * c;  // static 메서드에서는 static 변수 c 접근 o
		// return a + b; // static 메서드에서는 인스턴스 변수 a, b 접근 x
	}
	
	public static int subtract(int d, int e) {
		return (d - e) * c;
	}
	
	public static int multiply(int d, int e) {
		return (d * e) * c;
	}
	
	public static double divide(int d, int e) {
		return (d / (double)e) * c;
	}
	
	
}
public class Class27 {

	public static void main(String[] args) {
		
		Mymath mm = new Mymath();  // 객체가 생성되는 순간, static 변수 c 는 1 증가
		mm.init();  // mm 객체의 a에는 20, b에는 30 이 저장됩니다. 값을 초기화하는 Mymath 클래스내의 인스턴스 멤버메서드.
		
		System.out.println( "mm.add() -> " + mm.add() );
		System.out.println( "mm.subtract() -> " + mm.subtract());
		System.out.println( "mm.multiply() -> " + mm.multiply());
		System.out.println( "mm.divide() -> " + mm.divide());
		
		System.out.println( "Mymath.add(10, 30) -> " + Mymath.add(10,30));
		System.out.println( "Mymath.subtract(10, 30) -> " + Mymath.subtract(10, 30));
		System.out.println( "Mymath.multiply(10, 30) -> " + Mymath.multiply(10, 30));
		System.out.println( "Mymath.divide(10, 30) -> " + Mymath.divide(10, 30));
		
		System.out.println( add(30, 50));
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	// Class27 내부에는 인스턴스 메서드와 static 메서드를 자유롭게 추가할 수 있습니다.
	// 다만, static으로 만들어진 main 메서드안에서 호출해서 사용하려면 반드시 static 으로 생성해야 합니다.

}
