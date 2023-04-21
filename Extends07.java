package days11;

// 시험 문제 다음 실행 코드 결과값을 쓰는 것이 문제이다. 출력 순서대로 쓰기만 하면 된다.

class SuperE{
	SuperE(){
		this(5);
		System.out.println("SuperE()");  // 3
	}
	SuperE(int i){
		this(10.12);
		System.out.println("SuperE(int)");  // 2
	}
	SuperE(double d){
		System.out.println("SuperE(double)");  // 1
	}
	SuperE(String s){
		this();
		System.out.println("SuperE(String)");  // 4
	}
	
}

class SubE extends SuperE{
	SubE(){
		this("");
		System.out.println("SubE()");  // 8
	}
	SubE(int i){
		super("");
		System.out.println("SubE(int)");  // 5
	}
	SubE(double d){
		this(3);
		System.out.println("SubE(double)");  // 6
	}
	SubE(String s){
		this(123.12);
		System.out.println("SubE(String)");  // 7
	}
}

public class Extends07 {

	public static void main(String[] args) {
		
		SubE s = new SubE();
		
		
	}

}
