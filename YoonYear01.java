package practice;

import java.util.Scanner;

public class YoonYear01 {

	public static void main(String[] args) {
		
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false 를 출력
		// 윤년의 조건
		// 해당 년도가 4의 배수이면서, 100의 배수가 아니거나, 400의 배수인 해
		
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.printf("년도를 입력하세요 : ");
		y = sc.nextInt();
		
		if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) System.out.println("해당 년도는 윤년입니다");
		else System.out.println("해당 년도는 평년입니다");
		
	}

}
