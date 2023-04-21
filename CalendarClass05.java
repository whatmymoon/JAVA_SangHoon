package days13;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass05 {

	public static void main(String[] args) {
		
		// 년과 월을 입력받아서 달력을 출력하세요
		int year,month;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도 입력 : ");
		year = Integer.parseInt( sc.nextLine() );
		System.out.printf("월 입력 : ");
		month = Integer.parseInt( sc.nextLine() );
		
		// 1. 입력한 년과 월의 1일자와 말일자를 저장할 Calendar 객체를 생성
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// 2. 1일자와 말일자를 해당객체에 set 합니다.
		
		// while(true) {
			
		sDay.set(year, month - 1, 1);
		eDay.set(year, month - 1, sDay.getActualMaximum( Calendar.DATE ));
		//sDay.set(year, month, 1); // 입력한 달의 다음달 1일
		//eDay.add(Calendar.DATE, -1); // 다음달 1일의 전날 -> 이달의 말일
			
		// 3. 1일자의 요일을 계산합니다. 요일을 저장할 변수 startWeek
		while(true) {
		int startWeek = sDay.get( Calendar.DAY_OF_WEEK );
			
		// 4. 달력 타이틀 출력  0000년 00월  일 월 화 수 목 금 토 일 등등
			
			System.out.println("\n" + year + "년 " + month + "월 ");
			System.out.println("---------------------------------");
			System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			System.out.println("---------------------------------");
			
			// 5. 첫칸부터 1일자 요일칸 바로 전까지 빈칸 출력
			
			for(int i = 1; i < startWeek; i++) System.out.printf("     ");
			
			// 6. 1일부터 말일까지 출력
			
			for(int i = 1; i <= eDay.get( Calendar.DATE ); i++) {
				
				System.out.printf("%3d  ", i);
				if( startWeek++ % 7 == 0 ) System.out.println();
				// startWeek++;
				
			}
			System.out.println("\n---------------------------------");
			System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)]");
			input = Integer.parseInt( sc.nextLine() );
			if(input == 3) break;
			
			if(input == 1) sDay.add( Calendar.MONTH, -1);
			else sDay.add( Calendar.MONTH, 1);
			eDay.set( year,  sDay.get( Calendar.MONTH ), sDay.getActualMaximum( Calendar.DATE ));
			year = sDay.get(Calendar.YEAR);
			month = sDay.get(Calendar.MONTH) + 1;
		}
		
	}

}
