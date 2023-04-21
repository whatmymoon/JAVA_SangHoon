package days04;

public class ControllOp_For03 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합, 단순 출력아닌 for 반복문에서 연산까지 해보자
		// int sum = 1+2+3+4+5+6+7+8+9+10; // 1부터 100? 1부터 1000까지는 어떻게 할 것인가... 추천하지않는 방법
		int sum = 0;
		int i;
		for(i=1; i<=10000; i++) {
			sum = sum + i;
			System.out.println("1부터" + i + "까지의 합 : " + sum);
		}
		System.out.println("\n최종 1부터 " + (i-1) + "까지의 합은 " + sum +"입니다");
	}

}
