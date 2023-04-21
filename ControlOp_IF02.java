package days03;

import java.util.Scanner;

public class ControlOp_IF02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 2;
		
		if( b == 0 ) {
			System.out.println("입력한 정수는 짝수(even)입니다");
			b = 1;
		}else{
			System.out.println("입력한 정수는 홀수(odd)입니다");
		}
		
		System.out.println();
		
		int kor = 70, eng = 98, mat = 95;
		double avg = (kor + eng + mat)/3.0;
		// 평균이 80이상이라면 합격 그렇지 않으면 불합격 이라고 출력
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		avg = (kor + eng + mat)/ 3.0;
		
		if(avg >= 80) {
			System.out.println("합격입니다");
		}else System.out.println("불합격입니다");
		
		System.out.println();
		// 평균 60이상이거나 영어점수가 80이상이라면 합격, 아니면 불합격
		if( avg >= 60 || eng >= 80)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		// 년도 하나를 입력 받아서 변수에 저장하고 입력한 년도가 윤년인지 평년인지를 출력하도록 if 문을 작성하세요
		System.out.printf("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		int x = year % 4;
		int y = year % 100;
		int z = year % 400;
		
		if((x==0) && (y!=0) || (z==0))System.out.println("입력한 년도는 윤년입니다");
		else System.out.println("입력한 년도는 평년입니다");

	}

}
