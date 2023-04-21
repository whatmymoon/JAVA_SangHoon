package days08;

import java.util.Scanner;

public class Method12 {

	public static void main(String[] args) {
		
		
		int a, b;
		double c;
		a = myInput(1); // 밑변을 입력 받음. "밑변을 입력하세요"라고 안내
		b = myInput(2); // 높이를 입력 받음  "높이를 입력하세요"라고 안내
		// 전달인수가 1이면 밑변을 입력받아 리턴하는 메서드로,
		// 2이면 높이를 입력받아 리턴하는 메서드로 동작
		c = calculate(a, b); // 넓이를 계산
		prn(c); // 넓이 출력
		
	}
	
	public static int myInput(int s) {
		Scanner sc = new Scanner(System.in);
		int input;
		if( s == 1) System.out.print("밑변을 입력하세요 : ");
		else System.out.print("높이를 입력하세요 : ");
		input = sc.nextInt();
		return input;
		// return sc.nextInt(); -> input을 쓰고싶지 않을때, 입력받자마자 입력받은 수를 내보냄
	}
	
	public static double calculate(int a, int b) {
		return a * b * 0.5;
	}
	
	public static void prn(double c) {
		System.out.printf("입력한 삼각형의 넓이는 %.1f입니다", c);
		// System.out.println("입력한 삼각형의 넓이 : " + c );
	}
	

}
