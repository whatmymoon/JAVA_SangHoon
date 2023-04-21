package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도를 입력하세요 : ");
		int y = sc.nextInt();
		System.out.printf("월을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.printf("일을 입력하세요 : ");
		int d = sc.nextInt();
		int days = 0;
		
		days = 365 * (y-1);
		for(int i = 1; i<= (y-1); i++) if((i%4==0)&&(i%100!=0)||(i%400==0)) days++;
		else days = days;
		
		switch(m) {
		case 12: days = days + 30;
		case 11: days = days + 31;
		case 10: days = days + 30;
		case 9: days = days + 31;
		case 8: days = days + 31;
		case 7: days = days + 30;
		case 6: days = days + 31;
		case 5: days = days + 30;
		case 4: days = days + 31;
		case 3: if((y%4==0)&&(y%100!=0)||(y%400==0)) days = days + 29; else days = days + 28;
		case 2: days = days + 31;
		case 1: days = days;
		}
		days = days + d;
		int temp = days % 7;
		switch(temp) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
			
		}
		System.out.printf("%d 년 %d 월", y, m);
		System.out.printf("\n----------------------------------------------------\n");
		System.out.printf("Sun\tMon\tTue\tWed\tThr\tFri\tSat\n");
		for(int i=1;i<=31;i++) {
			System.out.printf("%2d\t",i);
			if(i%7 == 0)System.out.println();
		}
		System.out.printf("\n----------------------------------------------------\n");
		
	}

}
