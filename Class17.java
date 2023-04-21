package days10;

// int 형 자료를 매개변수로하는 생성자 와 디폴트 생성자를 오버로딩화하는 클래스 생성
// 전달인수가 있으면 전달인수를 멤버변수 dan에 저장, 전달인수가 없으면 dan 에 0 저장
// 멤버변수는 int dan; 한개만 생성
// 멤버메서드는 print() 하나
// print 메서드의 내용
// dan 이 0이 아니면 해당 구구단 출력
// dan 이 0이면 2~9단 구구단 모두 출력

class Googoodan{
	
	int dan;

	Googoodan(int dan) {
		this.dan = dan;
	}

	Googoodan() {
		dan = 0;
	}

	void print() {
		if(dan !=0) {
			System.out.printf("%d단 -> ", dan);
			for(int i = 1; i < 11; i++) {
				System.out.printf("%2d X %2d = %2d ", dan, i, dan*i);
			}
			System.out.println("\n");
		}else {
			for(int i = 1; i <= 9; i++) {
				for(int j = 2; j <= 5; j++) {
					System.out.printf("%d X %d = %2d  ", j, i, j * i);
				}
				System.out.println();
			}
			System.out.println();
			for(int i = 1; i <= 9; i++) {
				for(int j = 6; j <= 9; j++) {
					System.out.printf("%d X %d = %2d  ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}

public class Class17 {

	public static void main(String[] args) {
		
		Googoodan g1 = new Googoodan(7);  // g1 객체의 주소값을 Googoodan(int n) 이라는 클래스로부터 리턴 받는다
		Googoodan g2 = new Googoodan();  // g2 객체의 주소값을 Googoodan() 이라는 클래스로부터 리턴 받는다
		g1.print();
		g2.print();
		
	}
	
	

}
