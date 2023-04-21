package days08;

import java.util.Scanner;

// 메서드를 사용하는 세번째 목적
// 메서드 호출 후 메서드에서 계산된 결과를 호출한 지점에 리턴받아서 사용하고자 할때

// 리턴값이 존재하는 메서드를 사용하면 호출된 메서드가 return 명령을 이용하여 호출된 지점으로
// 결과값 하나를 되돌려 보내서 활용할 수 있습니다.

public class Method09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sq = squar( num );  // squar 메서드는 전달인수로 전달된 값이 제곱을 계산하는 메서드
		// squar 메서드가 호출되고 계산해서 리턴해준 값을 sq 변수에 저장합니다
		// 마치 연산식의 결과를 왼쪽 변수에 대입하듯 저장합니다
		// 그럼 아래와 같이 sq 변수에 담긴 값을 현재 main 메서드에서 활용할 수 있습니다
		System.out.printf("%d 의 제곱은 %d입니다\n", num, sq);
		
		int maxValue = max(10, 34, 67);
		System.out.printf("%d %d %d 중 가장 큰 숫자는? -> %d\n",10 , 34, 67, maxValue);
		
		max(20, 56, 35);  // 오류는 없음.
		// 리턴이 있는 메서드를 호출하고 그 리턴값을 받아 줄 수 있는 변수를 쓰지 않았을 때
		// 문법적으로 오류는 없지만 열심히 계산하고 결과를 버리는 셈이 됩니다
		// 다만 리턴이라는 명령을 쓰는 목적은 실행결과를 되돌려 받아서 쓰려는 목적이므로,
		// 목적에 맞게 사용하는 것이 올바른 사용이라고 할 수 있습니다
		maxValue = max(20, 56, 35);  // maxValue = 56;
		// 또한 메서드실행의 결과(리턴값)는 변수에 저장할 수 있을뿐만 아니라
		// 다음과 같이 다른 메서드 또는 연산의 일부로도 사용할 수 있습니다
		System.out.printf("%d %d %d 중 가장 큰 숫자는? -> %d\n", 20, 56, 35, max(20,56,35));
		// 리턴된 값이 System.out.printf()의 출력내용으로 사용됩니다
		int k = 10 + max(20, 56, 35);
		// 리턴된 값이 10과 덧셈연산이 실행됩니다
		
		// 메서드가 호출되고 리턴되는 순간 그 리턴값은 메서드호출문구를 대신하여 값으로 다른 연산에 참여합니다( =, +, -, *, / 등)
		
	}
	
	public static int squar(int n) { // return 되는 자료값이 정수형이라서 void -> int
		int s = n * n;
		return s;
		// 메서드가 실행된 결과를 되돌려주는 명령 & 호출한 곳으로 되돌아가는 명령 : return
		// 그동안 형식적으로 void라고 썼던 곳에 리턴되는 값의 자료형을 써줍니다
		// 리턴자료형은 메서드 생성과 동시에 고정됩니다.
		// 그동안 썼던 void 는 리턴값이 없다는 뜻으로 썼던 키워드입니다.
	}
	
	public static int max(int a, int  b, int c) {
		int max;
		if(a>b) max = a;
		else max = b;
		
		if(c > max) max = c;
		
		return max;
	}
	
}
