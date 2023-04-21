package days09;

// 클래스는 자료를 저장하는 거고, 메소드는 반복적인 것을 한번에 처리할 때 용이하다. 클래스는 변수의 확장판!! 많은 변수 저장할수있다
//같은 패키지 안에서는 클래스 이름이 중복될 수 없습니다. 그래서 Student 대신 Std라는 이름을 사용합니다
class Std{ 
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	
	void input(int b, String n, int k, int e, int m) {
		bun = b;  // 호출 객체 bun에 b 값을 대입한다
		name = n;
		kor = k;
		eng = e;
		mat = m;
		tot = k + e + m;
		ave = tot / 3.0;
	}
	
	void prnScore() {  // public은 현재 프로그램내에서만 쓸 경우, 빼도 무방하다.
		System.out.printf("%2d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%.1f\n", bun, name, kor, eng, mat, tot, ave);
	}
}

public class Class05 {

	public static void main(String[] args) {
		
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.input(1, "홍길동", 88, 77, 99);  // 전달인수가 각객체의 멤버변수에 저장되는 메서드 제작
		s2.input(2, "홍길서", 89, 98, 78);
		
		prnTitle();
		s1.prnScore();
		s2.prnScore();
		System.out.println("-------------------------------------------------------------");
		
		
	}

	public static void prnTitle() {
		System.out.println("\t\t     ####성적표####");
		System.out.println("-------------------------------------------------------------");
		System.out.println("번호\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
	}

}
