package days05;

import java.util.Scanner;

public class ControllOp_while04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("년도 입력 : ");
		int y = sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		int input = 0;
		
		while(true) {
			
			int days = 0;
			days = 365 * (y-1);
			for( int i = 1; i<=(y-1); i++) if((i%4 == 0) && (i%100 != 0) || (i%400 == 0)) days++;
					
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
				case 3: 
					if((y%4 == 0) && (y%100 != 0) || (y%400 == 0)) days = days +29; 
					else days = days + 28; 
				case 2: days = days + 31; 
				case 1: break;
			}
			days = days + 1;
			
			int temp = days % 7;
			
			int lastday = 0;
			switch(m) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:	lastday = 31; break;
				case 4:	case 6: case 9:	 case 11:lastday = 30; break;
				case 2:
					if((y%4==0)&&(y%100!=0)||(y%400==0)) lastday = 29;
					else lastday = 28;
			}
			System.out.printf("%d 년 %d 월\n", y, m);
			System.out.println("---------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			System.out.println("---------------------------------------------------");
			
			for(int i=1; i<=temp; i++) System.out.print("\t");
			
			for(int day=1; day<=lastday; day++) {
				System.out.printf("%2d\t", day);
				if( (day+temp)%7 == 0 )System.out.println();
			}
			System.out.println("\n---------------------------------------------------");
			
			System.out.printf("\n\n[1.이전달]\t[2.다음달]\t[3.종료] ");
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
