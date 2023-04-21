package days07;

public class Array15 {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		for(int k : a)
			System.out.printf("%d ", k);
		// 반복이 되는 동안 a배열값이 k 변수에 반복1회당 하나씩 모두 대입이 될꺼라서
		// 결국 위의 명령은 배열값을 차례로 출력하는 효과를 얻습니다
		
		int [][] b = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		System.out.println("\n");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%2d ",b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.printf("%2d ",b[i][j]);
			}
			System.out.println();
		}
		// b.length : 행의 갯수 , b[i].length : i행의 열의 갯수
		
		// for( int k : a ) : 참조변수로 각 배열의 값을 저장할 수 있는 일반변수에 ":"로 이어서 썻어요
		// 그래서 그 배열의 갯수만큼 반복하도록 명령한내용입니다
		System.out.println();
		for( int [] row : b ) {  // 3회 반복 -> b 제시
			for( int value : row) {  // 5회 반복 -> b[0] or b[1] or b[2] 을 제시
				System.out.printf("%2d ", value);
			}
			System.out.println();
		}
		
		
	}

}
