package practice;

import java.util.Scanner;

public class AndOr01 {

	public static void main(String[] args) {
		
		// %%% 모든 식을 사용자로부터 입력받아 코딩하라 %%%
		// 평균이 80점이상이면서 영어점수가 75점 이상이고, 국어점수가 80점이상이면 true 출력, 아니면 false 출력
		// 국어 : 50점 이상, 영어 : 60점 이상, 수학 : 70이상이면 true, 아니면 false 출력
		// 세 과목 중 한과목이라도 40점미만이라면 true, 모두 40이상 false 출력
		// 평균 60이상 모든과목 40이상 이라면 true, 아니면 false 출력 (논리연산의 대상이 네개)
		// 평균 60미만이거나 한과목이라도 40미만이라면 true, 아니면 false 출력 (논리연산의 대상이 네개)
		// 평균 70이상이거나 영어와 수학이 모두 80이상이면 true (And 와 Or의 혼합 연산)
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		
		System.out.printf("국어 점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학 점수 : ");
		mat = sc.nextInt();
		
		int total;
		total = kor + eng + mat;
		double avg;
		avg = total / 3.0;
		
		if((avg >= 80) && (eng >= 75) && (kor >= 80)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((kor >= 50) && (eng >= 60) && (mat >= 70)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((kor < 40) || (eng < 40) || (mat < 40)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((avg >= 60) && (kor >= 40) && (eng >= 40) && (mat >= 40)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((avg < 60) || (kor < 40) || (eng <40) || (mat < 40)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((avg >= 70) || ((eng >= 80) && (mat >= 80))) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		
	}

}
