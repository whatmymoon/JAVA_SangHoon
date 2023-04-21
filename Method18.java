package days08;

// call by reference 참조값 보냄
// call by value , call by reference

import java.util.Scanner;

public class Method18 {

	public static void main(String[] args) {
		
		int [][] scores;
		double [] avg;
		String [] grade;
		
		int s = getStudentNumber();  // 학생수를 입력 받아서 리턴하는 메서드
		int k = getSubjectNumber();  // 과목수를 입력 받아서 리턴하는 메서드
		
		scores = new int[s][k+1];  // k는 과목수이며 총점열을 위해 k+1만큼 지정
		
		avg = new double[s];
		grade = new String[s];
		
		input( scores );  // s 명의 학생의 k 개의 과목 점수 입력 ( 과목점수 입력 받을때, 과목명은 '1과목', '2과목'으로)
		cals( scores, avg, grade );  // 총점, 평균, 학점 계산
		output( scores, avg, grade );  // 양식에 맞게 성적표 출력
		
	}
		
	// s 명의 학생의 k 개의 과목 점수 입력하는 input 메서드
	public static void input( int [][] s ) {
	// s 참조변수는 main의 scores 변수값을 받는 매개변수이므로,
	// s 이름으로 배열에 값을 넣으면 main 의 scores 배열에 값을 넣는 것과 같습니다
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < s.length; i++) {
		for(int j = 0; j < s[i].length-1; j++) {
			System.out.printf("%d번 학생의 %d과목 점수 : ", i+1, j+1);
			s[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
	}
	
	// 총점, 평균, 학점 계산 cals 메서드
	public static void cals(int [][]s, double [] a, String [] g) {
		String [] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};
		
		for(int i = 0; i < s.length; i++)  {  // 학생의 인원 수 만큼 반복실행
			
			int k = s[i].length-1; // s[i].length : i행의 열갯수, 마지막 열의 첨자 s[i].length-1
			
			for(int j = 0; j < s[i].length - 1; j++) {  // 입력받은 과목 수 만큼 반복실행
				s[i][k] += s[i][j];  // 첫번째 열부터 마지막열의 바로 전 칸까지의 값을 마지막칸에 합산
			} // 총점 계산
			a[i] = s[i][k] / (double)k;  // 평균계산
			g[i] = grade[(int)(a[i] / 10)];  // 학점 선택
			
		}
		// 반드시 엑셀의 학생수행 과목수+1열만큼 배열을 그려놓고 시뮬레이션 해보세요
	}
	
	// 양식에 맞게 성적표 출력
	public static void output(int [][] s, double [] a, String [] g) {
		System.out.println("\t\t   ###성적표###");
		System.out.println("----------------------------------------------------");
		System.out.printf("번호\t");
		for(int i = 0; i < s[0].length-1; i++) // 과목수 만큼 과목의 이름 " 1과목 2과목 3과목...." 출력
			System.out.printf("%d과목\t", i+1);
		System.out.printf("총점\t평균\t학점\n");
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < s.length; i++) {
			System.out.printf("%2d\t", i+1);  // 번호 출력
			for(int j=0; j < s[i].length; j++)
				System.out.printf("%3d\t", s[i][j]);  // 1과목부터 모든과목점수와 총점까지 출력
			System.out.printf("%.1f\t", a[i]);
			System.out.printf("%2s\n", g[i]);
		}
		System.out.println("----------------------------------------------------");
	}
	
	// 학생수를 입력 받아서 리턴하는 getStudentNumber 메서드
		public static int getStudentNumber() {
			Scanner sc = new Scanner(System.in);
			System.out.print("학생 수를 입력하세요 : ");
			return sc.nextInt();
		}
			
		// 과목수를 입력 받아서 리턴하는 getSubjectNumber 메서드
		public static int getSubjectNumber() {
			Scanner sc = new Scanner(System.in); // controll shift o
			System.out.print("과목이 몇과목인가요 : ");
			int subjectNumber = sc.nextInt();
			return subjectNumber;
		}
}
