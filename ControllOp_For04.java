package days04;

import java.util.Scanner;

public class ControllOp_For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요(2~9) : ");
		dan = sc.nextInt();
		// 입력한 숫자의 구구단을 출력하세요
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// ...
		// 2 x 9 = 18
		
		for(int i=1; i <= 9; i++) System.out.println(dan + " x " + i + " = " + dan*i);
		System.out.println();
		
		for(int i=1; i <= 9; i++) System.out.printf("%d x %d = %d\n", dan, i , dan * i);
		System.out.println();
		
	}

}
