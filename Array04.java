package days06;

public class Array04 {

	public static void main(String[] args) {
		
		// 배열 a, b, c 생성  (각 갯수 10개)
		// a 배열에는 3의 배수들 10개 저장 - 반복실행문 이용
		// b 배열에는 5의 배수들 10개 저장 - 반복실행문 이용
		// c 배열에는  a배열과 b배열의 각 같은 인덱스 값들의 합을 저장 
		// 반복실행문 이용
		// ex) c[3] = a[3] + b[3];
		// 출력
		// a배열 -> 3, 6, 9,12,15 ....
		// b배열 -> 5,10,15,20,25...
		// c배열 -> 8,16,24,32,40 ....
		
		// 배열의 생성
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		
		// 배열의 값 대입
		for(int i=0; i<=9; i++)
			a[i] = (i+1)*3;
		for(int i=0; i<=9; i++)
			b[i] = (i+1)*5;
		for(int i=0; i<=9; i++)
			c[i] = a[i] + b[i];
		/*
		for(int i=0; i<=9; i++){
			a[i] = (i+1)*3;
			b[i] = (i+1)*5;
			c[i] = a[i] + b[i];
		}
		 */
		
		// 출력
		System.out.printf("\n a배열 -> "); 
		for(int i=0; i < a.length; i++) System.out.printf("%d ", a[i]);
		System.out.printf("\n b배열 -> ");
		for(int i=0; i < b.length; i++) System.out.printf("%d ", b[i]);
		System.out.printf("\n c배열 -> ");
		for(int i=0; i < c.length; i++) System.out.printf("%d ", c[i]);
		// 배열이름.length : 배열에 할당되어 있는 공간의 갯수
		

	}

}











