package days08;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		
		int [] a = {56, 54, 87, 89, 25, 36, 57, 98};
		Scanner sc = new Scanner(System.in);
		int isExit;
		do {
			System.out.print("메뉴를 선택하세요\n(합계:1, 평균:2, 오름차순정렬:3, 내림차순정렬:4) : ");
			int input = sc.nextInt();
			switch(input) {
				case 1 : sum(a); break;
				case 2 : avg(a); break;
				case 3 : sort(1, a); break;
				case 4 : sort(2, a); break;
				default : misstake(); break;
			}
			System.out.printf("다른 메뉴를 선택하시겠습니까?(Y:1 / N:2)");
			isExit = sc.nextInt();
		}while(isExit!=2);
		
		System.out.printf("\n시스템을 종료합니다. Main 메소드가 곧 종료됩니다");
	}
	
	//misstake Method -> 잘못 입력한 경우
	public static void misstake() {
		System.out.println("잘못 입력하셨습니다");
	}
	
	// sum Method -> 배열의 합계
	public static void sum(int []b) {
		int sum = 0;
		for(int k : b) sum = sum + k;
		System.out.println("배열의 합계 : " + sum);
	}
	
	// avg Method -> 배열의 평균
	public static void avg(int []c) {
		// sum(c);
		int sum = 0;
		double avg;
		for(int i = 0; i < c.length; i++) sum += c[i];
		avg = sum / (double)c.length; // double형으로 캐스팅 연산한다.
		System.out.println("배열의 평균 : "+ (int)(avg*100)/100.0);		
	}
	
	// sort Method -> 배열의 오름차순 / 내림차순 정렬
	public static void sort(int num, int []d) {
		switch(num) {
		case 1: System.out.printf("오름차순 정렬 -> ");
		for(int i = 0; i < d.length; i++) {
			for(int j = i+1; j < d.length; j++) {
				if(d[i] > d[j]) {
					int temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for(int i=0; i < d.length; i++) System.out.printf("%d ", d[i]);  // (==) for( int k : d) System.out.printf("%d ", k);
		System.out.println();
		break;
		case 2: System.out.printf("내림차순 정렬 -> ");
		for(int i = 0; i < d.length; i++) {
			for(int j = i+1; j < d.length; j++) {
				if(d[i] < d[j]) {
					int temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for( int k : d) System.out.printf("%d ", k);
		System.out.println();
		break;
		}
	}

}
