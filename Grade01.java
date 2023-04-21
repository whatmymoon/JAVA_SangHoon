package practice;

import java.util.Scanner;

public class Grade01 {

	public static void main(String[] args) {
		
		// 평균이 80이상이라면 합격 그렇지 않으면 불합격 이라고 출력
		// 평균 60이상이거나 영어점수가 80이상이라면 합격, 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, total;
		double avg;
		
		System.out.printf("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.printf("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		avg = (kor+eng+mat)/3.0;
		if(avg>=80) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		if((avg>=60)||(eng>=80)) System.out.printf("합격\n");
		else System.out.printf("불합격\n");
		
		// ### if 사용 ###
		// 평균점수가 80점 이상이면 합격, 70이상 79이하면 대기순번, 나머지는 불합격을 출력해주세요
		// 사용자로부터 입력받고 if문 사용하여 문제를 풀어보아요
		
		System.out.println();
		if(avg>=80) System.out.printf("합격\n");
		else if((avg<=79) && (avg>=70)) System.out.printf("대기순번\n");
		else System.out.printf("불합격\n");
	}

}
