package days04;

import java.util.Scanner;

public class ControllOp_For07 {

	public static void main(String[] args) {
		
		// 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720
		Scanner sc = new Scanner(System.in);
		
		int k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		
		int fact = 1;
		System.out.printf("%d! = ",k);
		for(int i = k; i > 1; i--) { // 7을 입력햇다면
			System.out.printf("%d x ",i); // 7 x 6 x 5 x 4 x 3 x 2 x 출력
			fact = fact * i;
		}
		System.out.printf("1 = %d\n",fact); // 1 = 결과 출력
		
		
		
	}

}
