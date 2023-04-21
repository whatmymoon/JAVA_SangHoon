package days02;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		
		// 이름, 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 기존 성적표 양식에 맞춰 출력하세요
		// 문자(이름)를 입력 받는 명령 -> sc.nextLine()
		// 입력 받을 때 반드시 이름부터 입력받으세요 순서: 이름, 국어, 영어, 수학
		// 평균은 소수점 첫째자리까지 출력합니다.
		// printf 또는 println 선택은 자유입니다.
		
		int kor, eng, mat, total;
		double average;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		System.out.println();
		
		total = kor + eng + mat;
		average = total / 3.0;
		System.out.printf("번호\t이름\t\t국어\t영어\t수학\t평균\t총점\n");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n", 1, name, kor, eng, mat, total, average);
		System.out.println(2 + "\t" + name + "\t\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + (int)(100 * (total/3.0)) / 100.0);
		System.out.println("------------------------------------------------------------------");
		System.out.println();
		// System.out.println() 은 %변수를 못넣기 때문에 소수 첫째자리까지 표기할때는 직접 계산식을 넣어주어야 한다.
		// System.out.printf() 은 반올림하여 계산하는데 System.out.println()은 버리기 때문에 그런 차이가 있다.
	}

}
