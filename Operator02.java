package days02;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		
		// (입력) 갖고 있는 사과의 총 갯수 입력 : xx
		// (입력) 상자 하나에 담길 사과의 갯수 입력 : xx
		
		// (출력) 입력조건으로 포장했을 때, 포장된 박스갯수, 남은 사과 갯수 출력
		// 박스갯수 : xx
		// 남은사과 : xx
		
		int n1, n2, n3, n4; 
		// n1 : 갖고 있는 사과의 총갯수 입력, n2 : 상자 하나에 담길 사과의 갯수
		// n3 : 담겨질 박스 갯수, n4 : 남은 사과 갯수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("갖고 있는 사과의 총 갯수를 입력하세요 : ");
		n1 = sc.nextInt(); //사용자로부터 받은 변수를 n1에 저장함.
		
		System.out.print("상자 하나에 담길 사과의 갯수를 입력하세요 : ");
		n2 = sc.nextInt(); //사용자로부터 받은 변수를 n2에 저장함.
		
		n3 = n1 / n2; //n1을 n2로 나눈 값 , 박스갯수
		n4 = n1 % n2; //n1을 n2로 나눈 나머지 , 사과갯수
		
		System.out.println("박스갯수 : " + n3);
		System.out.printf("박스갯수 : %d\n", n3);
		System.out.println("남은사과 : " + n4);
		System.out.printf("남은사과 : %d\n", n4);
		System.out.println();
		
	}

}
