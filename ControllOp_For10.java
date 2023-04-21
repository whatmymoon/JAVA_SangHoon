package days04;

import java.util.Scanner;

public class ControllOp_For10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		// 정수 하나를 입력 받아서 1부터 입력받은 정수까지 짝수의 합을 출력하세요
		
		for(int i=2; i<=num; i+=2) {
			sum = sum + i; System.out.println("2부터 " + i + "까지의 짝수들 합 : " + sum); 
		}
		System.out.println("1부터 입력받은 정수(" + num + ")까지 짝수의 합 : " + sum);
		
		System.out.println();
		sum = 0; 
		// 앞선 결과의 sum에는 6이라는 변수값이 저장되어 있으므로 같은 내용을 한번 더 입력하면 두배의 결과가 나오므로 0으로 초기화해줍니다
		for(int i=1; i<=num; i++) if( i%2 == 0 ) {
			sum = sum + i; System.out.println("2부터 " + i + "까지의 짝수들 합 : " + sum);
		}
		System.out.println("1부터 입력받은 정수(" + num + ")까지 짝수의 합 : " + sum);
		
		System.out.println();
		sum = 0;
		for(int i = 1; i<= num; i++) {
			if(i%2 == 1) continue; // 현재반복실행의 명령을 다 실행하기 전에 현재 점에서 실행중단 & 다음 반복으로 이동
			// 현재 이전의 명령들이 있다면 실행이 됩니다 (continue)
			sum = sum + i;
			System.out.println("2부터 " + i + "까지의 짝수들 합 : " + sum);
		}
		
		
		
	}

}
