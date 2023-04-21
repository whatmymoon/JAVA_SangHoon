package days03;

import java.util.Scanner;

public class ControlOp_IF08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double ave;
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		tot = kor + eng + mat;
		ave = tot/3.0;
		
		if(ave >= 60 && kor >= 40 && eng >= 40 && mat >= 40) System.out.println("합격");
		else {
			System.out.print("불합격\t");
			if(ave < 60) System.out.print("평균미달\t");
			if(kor < 40) System.out.print("국어과락\t");
			if(eng < 40) System.out.print("영어과락\t");
			if(mat < 40) System.out.print("수학과락\t");
		} // 중요한건 else를 쓰면 안된다. 팀 프로젝트 에선 주석문과 중괄호를 생략하지 않고 써주는게 좋다.
		
		// 평균 60점 이상이면서 모든 과목 40이상이면 합격
		// 그렇지 않다면 불합격을 출력하되
		// 해당하는 불합격사유(평균 미달, 국어 과락, 영어 과락, 수학 과락)를 모두 함께 출력하세요

	}

}
