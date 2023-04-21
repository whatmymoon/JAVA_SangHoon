package days11;

class SuperC{
	private int superNum;
	SuperC( int n ){
		
	}
	SuperC(){
		
	}
}

class SubC extends SuperC{
	int subNum;
	SubC(){
		super();
		// super(); 는 부모클래스의 생성자 중 매개변수가 없는 "디폴트 생성자"를 호출하는 명령이므로,
		// 혹시라도 부모클래스의 생성자가 매개변수있는 생성자로 대체되었다면 이는 에러를 발생합니다.
		// 이 에러를 해결할 수 있는 방법
		// 1. 부모클래스의 매개변수 행태대로 호출 : super(); 에 전달인수를 넣어줍니다 super(10);
		// 2. 부모클래스의 생성자를 오버로딩해서 자식클래스 생성자에서 호출하는 형태로 부모클래스 생성자를 추가합니다.
		// 3. 부모클래스의 매개변수 있는 생성자를 매개변수 없는 디폴트 생성자로 바꿉니다.
		// ### 부모클래스의 생성자 형태로 호출하거나, 그게 아니라면 호출한 대로 부모클래스 생성자를 추가하거나
	}
	// 매개변수가 있는 생성자로 자식생성자가 오버로딩된 경우....
	SubC(int n){
		// super(); or super(n); or this(); 이 셋중에 하나를 쓸 수 있습니다.
		// 다만 두개 이상은 쓰지 못합니다.
		// 아무것도 쓰지 않으면 super();호출됩니다. 이 경우 부모클래스에 디폴트 생성자 반드시 있어야 합니다.
		// 부모클래스의 디폴트생성자가 오버로딩 되어있거나 디폴트생성자 혼자만 있거나, 혼자있을땐 자동으로 디폴트 생성자가 있다.
		this();
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this() 0) - 부모클래스 생성자 호출 X");
	}
	
	SubC(int subNum, int num){
		super(num);  // or this(num);
		this.subNum = subNum;
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this())X - 부모클래스 생성자 호출 0");
	}
}

public class Extends05 {

	public static void main(String[] args) {
		
		SubC c = new SubC();
		
		
	}

}
