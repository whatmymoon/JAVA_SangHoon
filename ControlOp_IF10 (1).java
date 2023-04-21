package days03;

import java.util.Scanner;

public class ControlOp_IF10 {

	public static void main(String[] args) {
		
		// 2023년에 한해서 월과 일을 입력 받고, 요일을 출력하세요
		// 1월 10일 입력했다면 1월 1일부터 10일까지 10일의 날짜가 계산됩니다
		// 그를 7로 나눈 나머지를 구하면 3이고, 1:토요일 2:일요일 3:월요일...
		// 위와 같이 요일을 계산합니다 해당 입력일은 월요일
		// 2월 5일 입력했다면 - 1월에 해당하는 31일 + 입력한 5일 -> 36
		// 36을 7로 나눈 나머지 계산하면 1, 해당입력일은 토요일이 됩니다
		
		// 1. 요일을 계산할 월과 일을 입력 받습니다
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();
		
		int day;
		
		if(m == 1) day = d;
		else if(m == 2) day = 31 + d;
		else if(m == 3) day = 31 + 28 + d;
		else if(m == 4) day = 31 + 28 + 31 + d;
		else if(m == 5) day = 31 + 28 + 31 + 30 + d;
		else if(m == 6) day = 31 + 28 + 31 + 30 + 31 + d;
		else if(m == 7) day = 31 + 28 + 31 + 30 + 31 + 30 + d;
		else if(m == 8) day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
		else if(m == 9) day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
		else if(m == 10) day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
		else if(m == 11) day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
		else day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
		
		if(day % 7 == 0) System.out.print("금요일입니다");
		else if(day % 7 == 1) System.out.print("토요일입니다");
		else if(day % 7 == 2) System.out.print("일요일입니다");
		else if(day % 7 == 3) System.out.print("월요일입니다");
		else if(day % 7 == 4) System.out.print("화요일입니다");
		else if(day % 7 == 5) System.out.print("수요일입니다");
		else System.out.print("목요일입니다");
		System.out.println();
		
	}

}
