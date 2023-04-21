package days10;

// 복소수 5(정수부분) + 3i(허수부분)
// i -> 루트-1 : -1 의 제곱근 (허수)

class Complex{
	int real;
	int image;
	Complex(){
		this.real = 5;
		this.image = 6;
	}
	Complex(int real, int image/* , Complex this*/){  // this -> c2
		this.real = real;
		this.image = image;
	}
	public void init(int real, int image/* , Complex this*/) {  // this -> c1
		this.real = real;  // 멤버변수와 받은 변수의 이름이 같다면 this. 을 이용해서 구분해줍니다.
		this.image = image;  // 멤버변수는 this.멤버변수이름 으로 구분해줍니다.
	}
	void prn() {
		System.out.println("(" + real + " + " + image + "i" + ")");  
		// real = this.real -> c1.prn(); 이면 c1의 real값 호출
		// image = this.image -> c1.prn(); 이면 c1의 image값 호출
		// c2도 이하동무
	}
	
	public Complex add(Complex t /* , Complex this */) {  // this -> c1
		Complex temp = new Complex();
		temp.real = this.real + t.real;
		temp.image = this.image + t.image;
		return temp;
		
	}
	
	public Complex subtract(Complex t){
		Complex temp = new Complex();
		temp.real = this.real - t.real;
		temp.image = this.image - t.image;
		return temp;
	}
}

public class Class19 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.init(5, 6);
		Complex c2 = new Complex(2, 3);  // 2는 실수부에 3허수부에 저장하는 생성자 호출, 생성과 동시에 멤버변수의 값을 넣을 수 있다.
		c1.prn();   // (5 + 6i) 형태로 출력되는 메서드 호출
		c2.prn();   // (2 + 3i) 출력
		
		System.out.println();
		Complex c3 = c1.add(c2);  // 실수부는 실수부끼리 허수부는 허수부끼리 합산
		c1.prn();
		c2.prn();
		c3.prn();
		
		System.out.println();
		c3 = c1.subtract(c2);  // 실수부는 실수부끼리 허수부는 허수부끼리 뺄셈
		c1.prn();
		c2.prn();
		c3.prn();
		
		
	}

}
