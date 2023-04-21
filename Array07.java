package days06;

public class Array07 {

	public static void main(String[] args) {
		
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98, 100, 12};
		//배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)
		
		// 이중반복문을 사용합니다
		// 첫째 반복문의 제어변수 i
		// 두번째 반복문의 제어변수 j
		
		// i=0 일때 j는 1~9로 반복시켜서 a[i]와 a[j] 둘을 비교하고
		// a[j] 값이 더 자긍면 a[i]와 a[j]의 값을 오름 차순에 맞게 맞바꿉니다
		
		// i=1 일때 j는 2~9 로 반복시켜서 a[i] 와 a[j] 둘을 비교
		// i=2 일때 j는 3~9 로 반복시켜서 a[i] 와 a[j] 둘을 비교
		// i=3 일때 j는 4~9 로 반복시켜서 a[i] 와 a[j] 둘을 비교
		
		// j번째가 더 작은 값이면 i번째와 j번째를 서로 맞바꿉니다.
		
		int b = 10;
		int c = 20;
		int temp;
		temp = b; // b가 없어지기 전에 복사본을 만들어넣고
		b = c; // 10은 없어지고 c값인 20만 남는다.
		c = temp; // c에다가 복사해뒀던 temp 값을 넣어둔다.
		System.out.println("b : " + b + ", c : " + c); // 그러면 둘이 서로 바껴서 나온다.
		
		// 오름차순 정렬
		System.out.printf("오름차순 정렬 -> ");
		for(int i=0; i < a.length; i++) {
			for(int j=i+1; j < a.length; j++) {
				if( a[i] > a[j]) {
					// 서로 자리를 바꿉니다
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		
		
		// 내림차순 정렬
		System.out.printf("\n내림차순 정렬 -> ");
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
	}

}
