package days02;
// 컴퓨터는 더하는 것도 덜하는 것도 없이 하라는 것만 한다. 그러니 실행이 원활하지 않으면 코드확인부터 하자!

import java.util.Scanner;
// import 단축키 : Ctrl + Shift + 'o'

public class Variable02 {

	public static void main(String[] args) {
		
		int number1, number2;
		int result1;   // 덧셈, 뺄셈, 곱셈의 결과를 저장할 변수
		double result2;   // 나눗셈의 결과를 저장할 변수
		
		// 프로그래밍을 하다보면, 외부의 라이브러리 또는 API를 불러다 사용해야할 경우가 있는데,
		// 사용자로부터 화면 입력을 받는 도구는 외부 라이브러리에 있는 도구를 불러와서 사용해야 합니다.
		// 사용자 입력을 위해 불러와서 준비해야할 코드
		Scanner sc = new Scanner(System.in); // 화면입력을 위한 준비코드
		
		System.out.printf("첫 번째 정수를 입력하세요 : \n");
		// 원활한 입력을 위해 안내명령은 입력명령보다 반드시 위에 써줍니다.
		number1 = sc.nextInt(); // 화면으로부터 사용자가 입력한 내용을 프로그램 내부로 가져오라는 명령
		// 컴파일러가 sc.nextInt() 명령을 만나면 커서를 깜빡이면서 사용자에게서 입력이 있을때까지 무한정 대기합니다.
		System.out.println("첫 번째 입력한 정수는 " + number1 + " 입니다");
		
		//number2 변수에 두번째 정수를 입력받고, 그 둘의 덧셈 뺄셈 곱셈 나눗셈의 결과를 이전 예제에서 처럼 출력하세요
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		number2 = sc.nextInt();
		System.out.println("두 번째 입력한 정수는 " + number2 + " 입니다.");
		
		result1 = number1 + number2; // 덧셈의 결과 저장
		System.out.printf("%d + %d = %d\n", number1, number2, result1);
		result1 = number1 - number2; // 뺄셈의 결과 저장
		System.out.printf("%d - %d = %d\n", number1, number2, result1);
		result1 = number1 * number2; // 곱셈의 결과 저장
		System.out.printf("%d * %d = %d\n", number1, number2, result1);
		result2 = number1 / (double)number2; // 나눗셈의 결과 저장
		System.out.printf("%d ÷ %d = %.1f\n", number1, number2, result2); // (int)(result2*10)/10.0 이건 반올림이 아닌 버림이다.
		// 정수끼리 나눗셈은 실수형으로 나오기 때문에 result2 실수형 변수를 사용해주어야 한다.
		
		/* 내가 실습한 내용
		 * 우린 result1,result2 변수를 만들었기 때문에 각 자료형에 맞게 연산을 대입해주어야한다.
		System.out.println("두 수의 덧셈은 " + (number1+number2) + " 입니다");
		System.out.println("두 수의 뺄셈은 " + (number1-number2) + " 입니다");
		System.out.println("두 수의 곱셈은 " + (number1*number2) + " 입니다");
		System.out.println("두 수의 나눗셈은 " + (int)(100*(number1/(double)number2))/100.0 + " 입니다");
		System.out.println();
		*/
	}

}
