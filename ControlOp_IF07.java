package days03;

import java.util.Scanner;

public class ControlOp_IF07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String level; //직급을 저장할 변수
		int pay; //판매실적금액 변수
		
		System.out.print("직급 입력(과장/대리/사원) : ");
		level = sc.nextLine();
		
		System.out.print("판매실적금액 입력 : ");
		pay = sc.nextInt();
		
		double r, total = 0.0; // r : 활동비를 계산할 비율저장 변수, total : 판매실적+활동비를 저장할 변수
		// boolean b = leve.equals("과장") 이렇게 하면 대리 사원들도 boolean값(true,false)으로 저장해 놔야함.
		if( level.equals("과장")) r = 0.5;
		else if( level.equals("대리")) r = 0.25;
		else r = 0.15;
		
		total = pay + pay * r;
		System.out.println("총 지급액 : " + (int)total);
		
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력해주세요
		
		
		
	}

}
