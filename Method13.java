package days08;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {

		int kor, eng, mat, tot;
		double ave;
		// String grade;

		kor = myInput(1); // 점수 입력
		eng = myInput(2);
		mat = myInput(3);

		tot = sum(kor, eng, mat); // 총점 계산
		ave = avg(kor, eng, mat); // 평균 계산
		// grade = selectGrade(ave);

		prnTitle();
		prnScore(kor, eng, mat, tot, ave); // 번호 이름 출력 생략
		System.out.println("---------------------------------------");
	}

	public static int myInput(int n) {
		Scanner sc = new Scanner(System.in);

		if (n == 1)
			System.out.print("국어 점수를 입력하세요 : ");
		else if (n == 2)
			System.out.print("영어 점수를 입력하세요 : ");
		else
			System.out.print("수학 점수를 입력하세요 : ");

		return sc.nextInt(); // int score = sc.nextInt(); return score;
	}

	public static int sum(int kor, int eng, int mat) {
		return kor + eng + mat; // int sum = kor + eng + mat; return sum;
	}

	public static double avg(int kor, int eng, int mat) {
		return (kor + eng + mat) / 3.0; // int sum = kor + eng + mat; double ave = sum / 3.0; return ave;
	}

	public static void prnTitle() {
		System.out.println();
		System.out.println("\t    ###성적표###");
		System.out.println("---------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");

	}

	public static void prnScore(int kor, int eng, int mat, int tot, double ave) {
		System.out.printf("%3d\t%3d\t%3d\t%3d\t%.1f\n", kor, eng, mat, tot, ave);
	}

}
