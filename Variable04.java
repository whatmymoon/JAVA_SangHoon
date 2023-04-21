package days02;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		
		// 반지름을 입력받아서 원의 넓이와, 둘레의 길이를 출력합니다
		// 입력1, 출력2
		// 필요한 변수의 이름은 임의로 지어서 사용합니다.
		
		// 출력양식
		// 입력한 원의 넓이 : xx.xx, 둘레의 길이 : xx.xx
		
		// 넓이 = 반지름 x 반지름 x 3.141592  둘레 = 2 x 반지름 x 3.141592
		// 결과는 소수점 둘째자리까지만 표시. println 또는 printf 중 선택은 본인선택
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		double result1, result2;
		
		System.out.print("반지름을 입력하세요 : ");
		num1 = sc.nextInt();   // 입력 받은 변수 저장.
		
		result1 = num1 * num1 * 3.141592;
		result2 = 2 * num1 * 3.141592;
		
		System.out.printf("입력한 원의 넓이 : %.2f, 둘레의 길이 : %.2f", result1, result2);
		System.out.println();
		// 이렇게 설정하면 반올림하기 때문에 원의 넓이와 둘레의 길이가 버림한것보다 소수둘째자리에서 1값이 차이 날 수 있다.
		
		result1 = (int)((num1 * num1 * 3.141592) * 100) / 100.0;
		result2 = (int)((2 * num1 * 3.141592) * 100) / 100.0;
		
		System.out.println("입력한 원의 넓이 : " + (int)((num1 * num1 * 3.141592)*100)/100.0 + "," + 
				" 둘레의 길이 : " + (int)((2 * num1 * 3.141592)*100)/100.0);
		System.out.println("입력한 원의 넓이 : " + result1 + ", " + "둘레의 길이 : " + result2);
		
		// 다음 변수 값들은 소수 둘째자리까지 나타내기 위해 그 이후에 숫자들을 버리기 때문에 계산한 값보다 낮을 수 있다.

	}

}
