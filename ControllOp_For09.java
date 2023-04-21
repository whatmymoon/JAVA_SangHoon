package days04;

import java.util.Scanner;

public class ControllOp_For09 {

	public static void main(String[] args) {
		
		int sum = 0, i, num;
		Scanner sc = new Scanner(System.in);
		// 10 개의 정수를 입력받아 그들의 합계와 평균을 출력하세요
		// 10개를 입력하는 중간에 종료를 원하면 0을 입력하여 입력을 종료하고
		// 최종 합계를 출력합니다.
		
		// 입력양식
		// 입력 1 : xx
		// 입력 2 : xx
		// 입력 3 : xx
		//....
		// 입력 10 : xx
		
		// 출력양식
		// 입력한 정수들의 합계 : xxx
		// 입력한 정수들의 평균 : xx.x
		
		// 중간에 0을 입력하면 입력이 종료되고 그 동안 입력한 데이터만으로 합계평균을 출력하세요
		System.out.print("정수 열개를 엔터와 함께 하나씩 입력하세요\n");
		for(i=1;i<=10;i++) {
			System.out.printf("%2d : ",i); // %2d -> 정수값을 입력하는데 두자리 확보후 숫자를 쓴다 정렬할때 좋습니다
			num = sc.nextInt();
			if( num == 0 ) break; // 반복실행은 break로 정해진 횟수를 다 채우지 않고 멈출 수 있습니다
			sum = sum + num; // 반복실행속에 입력명령이 있다면, 다음 입력으로 현재 입력이 사라질 수 있습니다 그래서 sum에 합하여 저장
		}
		
		System.out.printf("입력한 정수들의 합계 : %d\n", sum);
		System.out.println("반복종료후 i 값 : " + i);
		System.out.printf("입력한 정수들의 평균 : %.1f\n", sum/(double)(i-1));
		System.out.println("입력한 정수들의 평균 : " + sum/(double)(i-1));
	}

}
