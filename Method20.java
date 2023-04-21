package days08;

import java.util.Scanner;

public class Method20 {

	public static void main(String[] args) {
		
		int [][] scores;
		double [] avg;
		String [] grade;
		Scanner sc = new Scanner(System.in);
		scores = memoryAllocation1(sc);  // 학생수 과목수 입력 받은 후 2차원 배열 생성해서 참조값 리턴
		avg = memoryAllocation2( scores.length );  // 전달한 학생수만큼 크기의 배열 생성후 참조값 리턴
		grade = memoryAllocation3( scores.length );  // 전달한 학생수만큼 크기의 배열 생성후 참조값 리턴
		
		input( scores );  // s 명의 학생의 k 개의 과목 점수 입력 ( 과목점수 입력 받을때, 과목명은 '1과목', '2과목'으로)
		cals( scores, avg, grade );  // 총점, 평균, 학점 계산
		output( scores, avg, grade );  // 양식에 맞게 성적표 출력
		
	}
	
	public static String[] memoryAllocation3(int length) {
		
		String [] a = new String[length];
		
		return a;
	}
	
	public static double[] memoryAllocation2(int length) {
		
		double [] a = new double[length];
		
		return a;
	}
	
	public static int[][] memoryAllocation1(Scanner sc) {
		
		int a,b;
		System.out.print("학생 수 : ");
		a = sc.nextInt();
		System.out.print("과목 수 : ");
		b = sc.nextInt();
		int [][] c = new int[a][b+1];
		
		return c;
	}
	

	

	

	
	public static void input( int [][] s ) {

	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < s.length; i++) {
		for(int j = 0; j < s[i].length-1; j++) {
			System.out.printf("%d번 학생의 %d과목 점수 : ", i+1, j+1);
			s[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
	}
	
	
	public static void cals(int [][]s, double [] a, String [] g) {
		String [] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};
		
		for(int i = 0; i < s.length; i++)  {  
			
			int k = s[i].length-1; 
			
			for(int j = 0; j < s[i].length - 1; j++) {  
				s[i][k] += s[i][j];  
			} 
			a[i] = s[i][k] / (double)k;  
			g[i] = grade[(int)(a[i] / 10)];  
			
		}
		
	}
	
	
	public static void output(int [][] s, double [] a, String [] g) {
		System.out.println("\t\t   ###성적표###");
		System.out.println("----------------------------------------------------");
		System.out.printf("번호\t");
		for(int i = 0; i < s[0].length-1; i++) 
			System.out.printf("%d과목\t", i+1);
		System.out.printf("총점\t평균\t학점\n");
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < s.length; i++) {
			System.out.printf("%2d\t", i+1);  
			for(int j=0; j < s[i].length; j++)
				System.out.printf("%3d\t", s[i][j]); 
			System.out.printf("%.1f\t", a[i]);
			System.out.printf("%2s\n", g[i]);
		}
		System.out.println("----------------------------------------------------");
	}

}
