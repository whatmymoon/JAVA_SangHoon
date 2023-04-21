package days07;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		
		// 정수 하나를 입력 받아서 그 정수에 해당하는 구구단을 출력하세요
		// 구구단 출력은 메서드를 이용해서 출력합니다. 메서드 이름 googoodan
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int dan = Integer.valueOf(sc.nextLine()); // == int dan = sc.nextInt();
		googoodan(dan);
		
	}
	
	public static void googoodan(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%2d x %2d = %2d  ", n, i, n*i);
			if(i%5==0)System.out.println();
		}
	}

}
