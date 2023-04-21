package days08;

public class Method16 {
	public static void main(String[] args) {
		
		int sumValue = sum(5,8,7,4,5,54,1,58,54);
		System.out.println("입력값들의 합은 : " + sumValue + "입니다");
		sumValue = sum(5,8,7,4,5,54,1,58,54,57,87,48,5,6,44,5);
		System.out.println("입력값들의 합은 : " + sumValue + "입니다");
		
	}
	
	// 메소드 오버로딩을 하는 것도 방법이지만 너무 비효율적이다 해당 자료형 변수에 앞에 ... 을 넣으면 전달인수 갯수만큼 배열이 생성되고
	// 그 배열에 전달인수가 저장됨으로써 이를 이용하여 메소드를 효과적으로 만들어 낼 수 있다.
	public static int sum( int ... a ) {
		// 전달되는 전달인수 갯수만큼의 배열이 생성되고 그 배열에 전달인수가 저장됩니다
		// 배열의 이름은 매개변수 a
		int tot = 0;
		for(int i = 0; i < a.length; i++) tot += a[i];
		return tot;
	}
}
	

