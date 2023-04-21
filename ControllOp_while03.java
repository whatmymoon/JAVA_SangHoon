package days05;

import java.util.Scanner;

public class ControllOp_while03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 컴퓨터가 내는 가위바위보를 랜덤하게 결정하여 저장합니다
		// double a = Math.random(); // 랜덤한 숫자를 소수점 아래의 숫자로 발생합니다
		// System.out.println((int)(a*3));
		
		while(true) { // 추가. 무한 반복문 안에서 프로그램 종료시 if 문을 사용해 종료를 할 수 있다.
			
			int comInt = (int)(Math.random()*3);
			String com;
			if(comInt==0) com = "가위";
			else if(comInt==1) com = "바위";
			else com = "보";
			
			System.out.print("가위(1)/바위(2)/보(3)/종료(0) 중하나를 입력하세요");
			int userInt = sc.nextInt();
			if(userInt == 0) break; // 추가
			String user;
			
			 /*switch(userInt) {
			 	case 1: user = "가위";
			 	case 2: user = "바위";
			 	case 3: user = "보";
			 }*/
			
			if(userInt == 1) user = "가위";
			else if(userInt == 2) user = "바위";
			else user = "보"; // 네개의 경우의 수가 있어도 종료는 위의 if문으로 break를 걸었기 때문에 else를 써도 무방하다
			
			System.out.println(" 컴퓨터 : " + com + " / " +"User : " + user);
			if(com.equals(user)) System.out.printf("무승부");
			else if ( com.equals("가위") && user.equals("바위"))System.out.printf("승리");
			else if ( com.equals("바위") && user.equals("보"))System.out.printf("승리");
			else if ( com.equals("보") && user.equals("가위"))System.out.printf("승리");
			else System.out.printf("패배");
			System.out.println();
		}	
		System.out.printf("프로그램이 종료됩니다"); //추가
		
	}

}
