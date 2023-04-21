package days04;

import java.util.Scanner;

public class ControllOp_For06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k;
		
		/*
		System.out.print("합계를 구할 끝숫자를 입력하세요 : ");
		k = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=k; i++)
			sum +=i;
		System.out.println("1부터 " + k + "까지의 합계 : " + sum);
		*/
		
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		
		/*
		// 입력한 숫자의 팩터리얼 계산 후 출력
		// 6을 입력했다면
		// 6! = 720
		int fact = 1;
		for(int i=1; i<=k; i++)	fact = fact * i; // for, if 문에 { } 중괄호 안에 명령어가 하나일 때에는 생략이 가능하다
		System.out.println(k + "! = " + fact);
		System.out.printf("%d! = %d\n",k, fact);
		System.out.println();
		*/
		
		// 6! = 1x2x3x4x5x6 = 720 이라고 출력되게 해주세요
		int fact = 1;
		System.out.printf("%d! = ", k); // k! =  ->이 출력
		for(int i=1; i<k; i++) {  // k에 7을 입력했다면 반복은 1부터 6까지만 반복
			
			System.out.printf("%dx", i); // 반복문을 통해 i=1부터 i=k-1까지의 1x2x3x...x(k-1)x ->까지 출력 
			
			fact = fact * i; // 반복문을 통해 fact에 1부터 k-1까지의 곱을 저장
			
		} // 이때까지는 k-1까지의 곱만 저장된 fact 변수이다
		
		System.out.printf("%d = %d", k, fact*k); // k =  -> 출력, fact값에 k는 곱하여져 있지 않으므로 fact변수의 k값 곱한 fact값 출력
		
		//위의 방식으로 fact 값에 k를 곱해도 되고 아래 방식처럼 fact 변수를 k 곱해서 저장한 후 콘솔창에 띄워도 무방하다
		fact = fact * k; // 7따로 곱셈계산
		System.out.printf("\n%d! = %d\n",k, fact); // 7과 최종 결과 7! 값은 반복실행과 따로 출력
		
		System.out.printf("\t겁나 쉬운 자바프로그래밍~~!!\n");
		System.out.println();
		
	}

}
