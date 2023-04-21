package days03;

import java.util.Scanner;

public class ControlOp_IF06 {
	public static void main(String[] args) {
		
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총지급액을 출력하세요
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int basic; // 기본급 저장 변수
		double total; // 총지급액 저장 변수
		double bonus; // 계산된 보너스 금액 저장 변수
		
		// 기본급 사용자로부터 입력받기
		System.out.print("기본급을 입력하세요 : ");
		basic = sc.nextInt();
		
		// 보너스 금액 계산
		if(basic < 1000000) bonus = basic * 0.6;
		else bonus = basic * 0.5;
		
		// 총 지급액 계산(기본급 + 보너스)
		total = basic + bonus;
		
		// 총지급액 출력
		System.out.printf("기본급 : %d, 보너스 : %.1f, 총지급액 : %.1f\n", basic, bonus,total);
		
		
		
		
		
		
		// ------------------------------------------------------------------------------------------------------------------------------
		if(basic >= 1000000) System.out.printf("기본급 : %d, 보너스 : %.1f, 총지급액 : %.1f\n",basic, basic*0.5, basic + basic*0.5);
		else System.out.printf("기본급 : %d, 보너스 : %.1f, 총지급액 : %.1f\n",basic, basic*0.6, basic + basic*0.6);
		// ----------------------이 방식보다 위에 방식이 이상적이다----------------------------------------------------------------------
		
		
		
	}
}
