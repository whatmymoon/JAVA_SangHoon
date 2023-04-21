package days03;

import java.util.Scanner;

public class ControlOp_IF03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if( a > 0 ) {
			System.out.println("양수입니다");
		}else {
			if( a < 0 ) {
				System.out.println("음수입니다");
			}else System.out.println("0 입니다");
		}
		
		if( a > 0 ) {
			System.out.println("양수입니다");
		}else if( a < 0 ){
			System.out.println("음수입니다");
		}else System.out.println("0 입니다");
		// 맨 위의 () 안의 비교연산식으로 계산한 결과가 true 경우 {}안의 명령이 실행됩니다
		// 맨 위의 () 연산이 false 인 경우 다음 else if 의 비교연산식을 계산하고 true 경우 {} 안의 명령이 실행합니다
		// if 도 else if 도 모두 false 이면 else 부분을 실행하고 종료합니다
		
		// 중괄호 안의 명령이 한개라면 중괄호는 역시 생략가능합니다
		if( a > 0 ) System.out.println("양수입니다");
		else if( a < 0 ) System.out.println("음수입니다");
		else System.out.println("0 입니다");
		
		int kor = 70, eng = 79, mat = 75;
		// 평균점수가 80점 이상이면 합격, 70이상 79이하면 대기순번, 나머지는 불합격을 출력해주세요
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		double avg = (kor+eng+mat)/3.0;
		
		if( avg >= 80 ) System.out.println("합격입니다");
		else if( (avg >= 70)  &&  (avg <= 79)) System.out.println("대기순번");
		else System.out.println("불합격입니다");
		
	}

}
