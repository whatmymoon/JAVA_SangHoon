package days05;

import java.util.Scanner;

public class ControllOp_DoWhile02 {

	public static void main(String[] args) {
		
		// 두개의 정수와 연산할 연산자를 입력 받아서 해당 연산의 결과를 출력하되
		// 연산과 출력 끝나고 나면 "계속하시겠습니까?(Yes:1 / No:2)" 으로 물어보고
		// Y 를 입력하면 정수와 연산자 재입력 & 재연산
		// N 을 입력하면 프로그램 종료
		// do while을 이용하세요
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, result=0, operator;
		int isExit;
		
		do {
			
			System.out.print("1번째 정수를 입력하세요 : ");
			n1 = sc.nextInt();
			System.out.print("2번째 정수를 입력하세요 : ");
			n2 = sc.nextInt();
			System.out.print("계산에 사용할 부호를 입력하세요(+:1, -:2, *:3, /:4) : ");
			operator = sc.nextInt();
			
			switch(operator) {
				case 1: result = n1 + n2; System.out.println(n1 + " + " + n2 + " = " + result); break;
				case 2: result = n1 - n2; System.out.println(n1 + " - " + n2 + " = " + result); break;
				case 3: result = n1 * n2; System.out.println(n1 + " x " + n2 + " = " + result); break;
				case 4: result = n1 / n2; System.out.println(n1 + " ÷ " + n2 + " = " + result); break;
			}
			System.out.printf("result = %d\n", result);
			System.out.print("계속하시겠습니까?(Yes:1 / No:2)");
			isExit = sc.nextInt();	
		}while(isExit != 2);
		System.out.println("프로그램이 종료됩니다");
		
	} // 여기까지 내용을 3월 2째주 복습하기

}
