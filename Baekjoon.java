package practice;

import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] c = new int[2];
		for(int i = 0; i < c.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			c[i] = Integer.parseInt(sc.nextLine());
		}
		int a = c[0], b = c[1];
		
		System.out.println("a + b = " + ( a + b ));
		

	}

}
