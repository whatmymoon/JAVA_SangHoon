package days06;

public class Array08 {

	public static void main(String[] args) {
		
		int [] a = new int[6];
		// 다섯세트가 출력되도록 프로그램을 변경해주세요
		// for문을 사용해주세요
		
		// 1~45 사이의 임의의 난수를 a 배열에 여섯개 저장한 후,
		// 오름차순으로 정렬해서 출력하세요.
		
		int k=1;
		
		do { // 다섯번 출력되게 하려면 for, do~while문을 통해 다섯번 출력을 해줍니다
			 // for(int k=1;k<=5;k++){~} 이렇게 써도 된다
			
			int i=0;
			int j=0;
			while( i < a.length ) { 
				//a 배열만큼 랜덤한 숫자 입력
				a[i] = (int)(Math.random() * 45) + 1;
				
				
				// 같은 숫자가 나오면 다시 출력
				for(j = 0; j<i; j++) {
					if(a[j] == a[i])break;
				}
				if(i == j) i++;
			
			}
			
			/*
			 * for(int i = 0; i< 6; i++){
			 * 	
			 * 	a[i] = (int)(Math.random()*45) + 1;
			 * 	int count = 0;
			 * 	for(int j = 0; j < i; j++){
			 * 		if(a[j] == a[i]) count++;
			 * 	}
			 * 	if(count > 0) i--;
			 * 
			 * }
			 */
			
			for(i = 0; i < a.length; i++) {
				
				for(j = i+1; j < a.length; j++) {
					
					if(a[i] > a[j]) { // 오름차순 정렬
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						
					}
					
				}
			}
			
			for(i = 0; i < a.length; i++)  System.out.printf("%2d ", a[i]); // 오름차순으로 뽑은 배열의 수를 나열
			System.out.println(); // 한 배열당 한줄바꿈.
			k++;

		
		}while(k<=5);		
	}

}
