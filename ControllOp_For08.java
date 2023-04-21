package days04;

import java.util.Scanner;

public class ControllOp_For08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 년도 입력 추가
		System.out.printf("년도 입력 : ");
		
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
						
		int days = 0;
		
		// 1. 입력받은 년도의 전년도까지 지나온 날짜수를 계산
		//    2023년을 입력했다고 가정할 때 2022년까지 지나온 날짜를 계산합니다
		//    365 x 2022 + (1년부터 2022년까지 있었던 윤년의 횟수)
		
		days = 365 * (y-1);
		for( int i = 1; i<=(y-1); i++) if((i%4 == 0) && (i%100 != 0) || (i%400 == 0)) days++; // 윤년의 횟수만큼 1일 추가
		
				
		// 1. 입력받은 월의 바로 전달까지 날짜수를 계산합니다
		switch(m) {
			case 12: days = days + 30; // 11월의 날짜수 30일을 합산 
			case 11: days = days + 31; // 10월의 날짜수 31일을 합산
			case 10: days = days + 30; // 9월의 날짜수 31일을 합산
			case 9: days = days + 31; // 8월의 날짜수 31일을 합산
			case 8: days = days + 31; // 7월의 날짜수 31일을 합산
			case 7: days = days + 30; // 6월의 날짜수 31일을 합산
			case 6: days = days + 31; // 5월의 날짜수 31일을 합산
			case 5: days = days + 30; // 4월의 날짜수 31일을 합산
			case 4: days = days + 31; // 3월의 날짜수 31일을 합산
			case 3: // 월에 해당하는 날짜수 계산 시 입력한 년도(y)가 윤년이라면 29를 아니라면 28을 합되게 설정합니다
				if((y%4 == 0) && (y%100 != 0) || (y%400 == 0)) days = days +29; // 입력한 년도가 윤년이라면 1일 추가
				else days = days + 28; // 2월의 날짜수 31일을 합산
			case 2: days = days + 31; // 1월의 날짜수 31일을 합산
			case 1: break;
			default : 
				System.out.print("잘못 입력하셨습니다.프로그램이종료됩니다");
				return;
		}
		
		days = days + d;
		int temp = days % 7;
		
		switch (temp) {
			case 0 : System.out.println("일요일");   break;
			case 1 : System.out.println("월요일");   break;
			case 2 : System.out.println("화요일");   break;
			case 3 : System.out.println("수요일");   break;
			case 4 : System.out.println("목요일");   break;
			case 5 : System.out.println("금요일");   break;
			case 6 : System.out.println("토요일");   break;
		}
		
		
	}

}
