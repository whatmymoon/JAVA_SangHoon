package days06;

import java.util.Scanner;

public class Array09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("년도 입력 : ");
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		int input = 0;
		
		int [] mdays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(true) {
			
			if((y%4 == 0) && (y%100 != 0) || (y%400 == 0)) mdays[2] = 29;
			else mdays[2] = 28;
			
			int days = 0;
			days = 365 * (y-1);
			
			for( int i = 1; i<=(y-1); i++) if((i%4 == 0) && (i%100 != 0) || (i%400 == 0)) days++;
			
			
			for( int i = 1; i <= m-1; i++) days = days + mdays[i]; // 월 날짜를 위한 switch문 대신 작성
			
			days = days + 1;
			
			int temp = days % 7;
			
			
			System.out.printf("%d 년 %d 월\n", y, m);
			System.out.println("-----------------------------------");
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			System.out.println("-----------------------------------");
			
			for(int i=1; i<=temp; i++) System.out.print("    ");
			
			for(int day=1; day<=mdays[m]; day++) { // 배열을 통해서 해당월 말일자가 들어가게 된다
				System.out.printf("%3d ", day);
				if( (day+temp)%7 == 0 )System.out.println();
			}
			System.out.println("\n---------------------------------");
			
			System.out.printf("[1.이전달]  [2.다음달]  [3.종료] ");
			input = sc.nextInt();
			if(input==3) break;
			else if(input==1) {
				if(m == 1) {
					m = 12; y--;
				}else m--;
			}else {
				if(m == 12) {
					m = 1; y++ ;
				}else m++;
			}
			
		} System.out.printf("프로그램을 종료합니다");
		
	}

}
