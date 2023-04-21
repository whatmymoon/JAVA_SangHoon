package days11;

class NormalA{
	int num;
}
class NormalB{
	int num;
}

public class Extends09_TypeCasting01 {

	public static void main(String[] args) {
		
		// 기본 자료형간의 형변환(TypeCasting)은 자료형의 크기에 제약을 받습니다.
		short s = 10;
		int i = s; // 자동 형변환(short -> int) : 작은용량에서 큰 요량의 변수로
		int j = 10;
		// short k = j  // 에러(int -> short) : 큰 용량에서 작은 용량의 변수로는 데이터 손실이 발생
		// 해결방법은 강제 캐스팅 연산자를 앞에 붙여서 사용합니다.
		short k = (short)j;
		// 강제 캐스팅도 두 자료형간의 호환성이 있어야 가능합니다.
		// String str = i; // 에러 String.valueOf(i_)
		// int p = "1234"; // 에러 Integer.parseInt("1234");
		
		// 클래스의 레퍼런스 변수간의 형변환은 각 레퍼런스의 접근 범위에 영향을 받습니다.
		// 서로 다른 클래스 객체 간의 형변환은 허용되지 않습니다.
		NormalA a1 = new NormalA();
		// NormalB b1 = a1; // 에러 - NormalA의 객체인스턴스로 NormalB참조변수에 저장 X
		// NormalB b1 = new NormalA(); // 에러 - NormalA의 뉴 인스턴스로 NormalB참조변수에 저장 X
		NormalB b2 = new NormalB();
		// NormalA a2 = b2; // 에러
		// NormalA a2 = new NormalB(); // 에러

	}

}
