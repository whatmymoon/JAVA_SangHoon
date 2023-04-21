package days07;

public class Method04 {

	public static void main(String[] args) {
		
		// prnTitle() : 성적표 제목, 번호 이름 국어 영어 등과 같은 열제목을 출력하는 메서드
		// prnScore() : 이름, 국어, 영어, 수학 점수를 전달받아서 총점 평균을 계산하고 성적점수들을 출력하는 메서드
		prnTitlePre();  // 성적표 제목 및 열제목(번호 이름 국어 영어 ...) 출력
		prnScore(1, "홍길동", 87, 89, 97);
		prnScore(2, "홍길서", 45, 98, 78);
		prnScore(3, "홍길남", 77, 88, 99);
		prnTitlePost();
		programExit();  // 성적표 마지막에 그어지는 선
		
	}
	
	//prnTitlePre Method
	public static void prnTitlePre() {
		
		System.out.println("\t\t\t=== 성적표 ===");
		System.out.println("-------------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		
	}
	
	//prnScore Method
	public static void prnScore(int num, String name, int kor, int eng, int mat) {
		
		int tot;
		double avg;
		tot = kor + eng + mat;
		avg = tot / 3.0;
		System.out.printf("%2d\t%s\t\t%3d\t%3d\t%d\t%d\t%.1f\n", num, name, kor, eng, mat, tot, avg);
		
		
	}
	
	//prnTitlePost Method
	public static void prnTitlePost() {
		System.out.println("-------------------------------------------------------------");
	}
	
	//programExit Method
	public static void programExit() {
		System.out.println();
		System.out.println("\t\t        수고하셨습니다.");
	}

}








/*
 * Scanner sc = new Scanner(System.in); // controll + shift + o 입력 자동으로 필요한 것을 임포트 해준다.
 * 
 * int kor; // 국어점수를 사용자로부터 입력받기 위해 정수형 변수를 만듦.
 * 
 * System.out.print("국어 점수를 입력하세요 : ");
 * kor = Integer.valueOf(sc.nextLine()); // Integer.valueOf(String) -> String 형태의 자료를 int 형태로 받는 방법!
 * kor = sc.nextInt(); // 사용자로부터 정수 입력받은 것을 kor 변수에 저장.
 * 어떤 변수라도 초기화해야지 사용 가능하다.
 * Integer.valueOf(String)을 쓰는 이유는 우리가 정수형 변수만 받는 것이 아닌 문자열 형태도 사용자로 부터 받아서 변수에 저장을 해야하는데
 * int 형 자료를 받으면 입력 buffer인 Enter가 남은 상태라 그 다음 바로 문자열 형태를 받을려고하면 자동으로 enter buffer을 받았다고 가정하고
 * 넘어가 버린다. 
 * 따라서, 정수형 형태의 자료를 받아도 String 형태로 enter buffer까지 받고 int 형태로 고쳐 쓰는 습관을 들이도록 하자!
 * 예시 int kor = Integer.valueOf(String);
 * 
 */
