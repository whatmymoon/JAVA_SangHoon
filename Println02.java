package days02;

public class Println02 {

	public static void main(String[] args) {
		
		System.out.println("\t\t\t###성적표###");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(1 + "\t" + "홍길동" + "\t\t" + 86 + "\t" + 55 + "\t" + 87
				+ "\t" + (86+55+87) + "\t" + (86+55+87) / 3.0 );
		System.out.println(2 + "\t" + "홍길남" + "\t\t" + 66 + "\t" + 84 + "\t" + 73
				+ "\t" + (66+87+73) + "\t" + (66+87+73) / 3.0 );
		System.out.println(3 + "\t" + "홍길서" + "\t\t" + 78 + "\t" + 88 + "\t" + 69
				+ "\t" + (78+88+69) + "\t" + (78+88+69) / 3.0 );
		System.out.print("--------------------------------------------------------------------------------\n");
		System.out.println();
		// System.out.println 으로 출력되는 실수는 소수점 조절이 되지 않습니다.
		// System.out.println 으로 출력되는 수치 데이터는 소수점 정렬도 하기가 어렵습니다.
		// 단순출력은 print 로도 가능합니다.
		// System.out.printf(); , System.out.println(); , System.out.print();
		
		System.out.println("1\t홍길동\t\t87\t98\t85\t" + (87+98+85) + "\t" + (87+98+85)/3.0);
		System.out.println();
		
		
		

	}

}
