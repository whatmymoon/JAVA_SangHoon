package days08;

public class Method17 {

	public static void main(String[] args) {
		
		sort( "asc", 78, 25, 56, 32, 45, 78, 98);  // 오름차순
		System.out.println();
		sort( "desc", 87, 75, 23, 65, 45, 8, 56, 98, 78, 12);  // 내림차순
		
		
	}
	// 같은 자료형의 갯수가 정해지지 않은 전달인수를 int ... a 와 같은 매개변수로 처리할 때
	// 추가로 전달할 전달인수 & 매개변수가 있다면, 반드시 int ... a가 가장 마지막에 위치해야합니다.
	// 그렇지 않으면, 배열에 전달되는 값들이 몇개인지 구분이 되지 않아 에러를 발생합니다.
	// public static void sort( int ... a , String s){ } // 에러
	
	public static void sort( String s , int ... a ){
		if(s == "asc") { // if(s.equals("asc"))
			
			for(int i = 0; i < a.length; i++) for(int j = i+1; j < a.length; j++) if(a[i] > a[j]) 
					{ 
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp; 
					}
			
			System.out.print("오름차순 -> ");
			
		}else{
			for(int i = 0; i < a.length; i++) for(int j = i+1; j < a.length; j++) if(a[i] < a[j]) 
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
			
			System.out.print("내림차순 -> ");
			
			
		}
		for( int k : a ) System.out.printf("%d ", k);
	}

}
