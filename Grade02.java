package practice;

import java.util.Scanner;

public class Grade02 {

	public static void main(String[] args) {
		/*// 90 이상 A학점, 80~89 B학점, 70~79 C학점, 60~69 D학점, 60 미만 F학점
		// 사용자로부터 점수를 입력받아 학점 보여주기 코딩
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.printf("점수를 입력하세요 : ");
		grade = sc.nextInt();
		if(grade >= 90) System.out.printf("A학점");
		else if((grade<=89)&&(grade>=80)) System.out.printf("B학점");
		else if((grade<=79)&&(grade>=70)) System.out.printf("C학점");
		else if((grade<=69)&&(grade>=60)) System.out.printf("D학점");
		else System.out.printf("F학점");
		
		// 출생년도를 입력 받아서 나이를 계산하고 2023 - 입력한 년도 + 1
		// 12세 미만 어린이, 12~18세 청소년, 19~25세 청년, 26세 이상(나머지) 성년 입니다. 라고 출력하는 if 문 작성
		
		System.out.println();
		int y, age;
		System.out.printf("출생년도를 입력하세요 : ");
		y = sc.nextInt();
		age = 2023 - y + 1;
		if(age < 12) System.out.printf("어린이");
		else if((age>=12) && (age <=18)) System.out.printf("청소년");
		else if((age>=19) && (age <=25)) System.out.printf("청년");
		else System.out.printf("성년");
		
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총지급액을 출력하세요
		
		int money;
		double bonus, total;
		System.out.println();
		System.out.printf("기본급을 입력하세요 : ");
		money = sc.nextInt();
		
		if(money >= 1000000) bonus = money * 0.5;
		else bonus = money * 0.6;
		
		total = money + bonus;
		System.out.printf("총 지급액 : %.1f\n",total);
		*/
		
		/*//판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력해주세요
		
		Scanner sc = new Scanner(System.in);
		String s;
		int money01;
		double total01;
		System.out.printf("직급을 입력하세요(과장,대리,사원) : ");
		s = sc.nextLine();
		System.out.printf("판매실적금액을 입력하세요 : ");
		money01 = sc.nextInt();
		if(s.equals("과장")) total01 = money01 + money01 * 0.5;
		else if(s.equals("대리")) total01 = money01 + money01 * 0.25;
		else total01 = money01 + money01 * 0.15;
		
		System.out.printf("%s의 활동비 : %.1f", s, total01);
		*/
		
		// 사용자를 기준으로 이겼습니다 / 무승부입니다 / 졌습니다 중 하나를 출력하세요
		// ### 사용자로부터 가위/바위/보를 입력받아 컴퓨터와 대결에 승리하세요###
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.printf("가위/바위/보를 입력하세요 : ");
		int a = (int)(Math.random()*3);
		String com;
		if(a==0) com = "가위";
		else if(a==1) com = "바위";
		else com = "보";
	}

}
