package days11;

import java.util.Calendar;

// Singleton pattern
// new 인스턴스를 만들려고 할 때마다 새롭게 인스턴스가 만들어지는 것이 아니라
// 미리 만들어놓은 인스턴스를 새로 만들어지는 객체들이 공유해서 사용하게 하는 패턴

// 멤버변수들이 static변수가 아니면서, 각 객체들이 공유해서 일관된 값을 가져야한다면,
// 덧붙여서 객체도 굳이 두개 이상 만들 필요가 없는 상황이라면,
// 하나의 인스턴스를 만들고, 그 주소를 새로 만들어지는 참조변수들이 공유해서 사용하게 하는 singleton을 사용합니다.

class SingletonEx{
	int n1;
	int n2;
	// 싱글턴 방식은 클래스가 뉴인스턴스를 보관하고 있다고 필요한 사용자에게 제공하는 방식.
	// 얘는 현재위치에 존재하는 공간을 사용자들에게 공유해주기 때문에 절대 한 개이외의 공간이 만들어지지 않습니다.
	
	// 싱글턴 패턴 생성방식
	// 1. 생성자를 private 으로 보호해서 외부에서 호출하지 못하도록 막습니다.
	private SingletonEx() {
		
	}
	
	// 2. 클래스 내부에 클래스를 사용하고자하는 외부에 제공할 객체를 생성합니다.
	private static SingletonEx itc = new SingletonEx();
	
	// 3. private 으로 보호된 itc 객체의 참조값을 리턴해주는 public 메서드를 제작합니다.
	public static SingletonEx getInstance() {
		return itc;
	}
	
}

public class Class30 {

	public static void main(String[] args) {
		
		// SingletonEx s1 = new SingletonEx();
		// SingletonEx s2 = s1;
		// 이 방법은 방문자 또는 사용자 한명이 프로그램을 실행해서 두 개의 변수가 하나의 뉴인스턴스를 공유하는 방법
		// 얘는 어떻게 사용하든 사용자가 두명이라면 공간이 두개가 할당됩니다.
		
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		// SingletonEx s3 = new SingletonEx();  // 생성자가 private 으로 보호되므로 에러
		s1.n1 = 100;
		s1.n2 = 200;
		System.out.println("s1의 n1 : " + s1.n1 + ", s1의 n2 : " + s1.n2);
		System.out.println("s1의 n1 : " + s2.n1 + ", s1의 n2 : " + s2.n2);
		
		// 생성자가 private 로 보호되어 main 메서드 안에서 new SingletonEx()로 새로운 객체 생성이 되지 않습니다.
		// 싱글톤 방식은 클래스 내부에 유일한 객체(itc)를 생성해두고(private static 으로 생성)
		// public static 으로 만들어진 getInstance() 메서드를 호출하여 itc(생성한 객체)를 리턴받아 객체를 사용합니다.
		// 생성자 메서드는 static 인스턴tm itc 만들 때 최초 실행된 때 말고는 실행되지 않습니다.
		// 주로 유지되어야 할 정보와 메서드를 많이 갖고 있는 클래스에서 많이 사용됩니다.
		// 두 개의 객체가 유지되면 부담스러운 부분을 하나로 공유하고 필요한 내용을 멤버 변수로 해결하는 방식입니다.
		// 싱글턴 패턴이 구현된 클래스의 활용
		// 날짜, 시간에 관련된 정보를 제공하는 Calendar 클래스 :
		// 클래스 싱글턴 패턴이 구현되어 new 인스턴스를 사용하여 객체생성이 안됩니다.
		// 반드시 getInstance 메서드를 사용하여야 합니다.
		
		// Calendar c1 = new Calendar();  // 에러
		Calendar c1 = Calendar.getInstance();
		
		ClassA a1 = new ClassA();
		ClassA a2 = new ClassA();
		
		System.out.println( a1 );
		System.out.println( a2 );
		// 만들어진 객체의 참조변수를 바로 print로 출력하면 "패키지이름.클래스이름@해시코드" 가 출력됩니다.
		// 해시코드 : 중복된 값이 나오지 않게 하기위해 실행된 알고리즘코드에서 계산한 코드입니다.
		//			  그 값은 객체의 고유한 값이 되며 다른 객체와 구분하기 위한 값으로 활용합니다.
		//			  new에 의해 생성된 각 객체가 저장된 공간 위치값(참조값)과도 관련이 있습니다.
		
		System.out.println( s1 );
		System.out.println( s2 );
		
		// 0 1 2 3 4 5 6 7 8 9 - 열 개의 숫자를 갖고 한자리 헤아림을 하는 수체계 -> 10진수
		// 0 1 - 두 개의 숫자를 갖고 한자리 헤아림을 하는 수체계 -> 2진수
		//       01 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000
		// 0 1 2 3 4 5 6 7 8 9 A B C D E F - 열 여섯개의 숫자로 한자리 헤아림을 하는 수체계 -> 16진수
		// 0 1 2 3 4 5 6 7 8 9 A B C D E F 10 11 12 ... 19 1A 1B 1C 1D 1E 1F 20 ...
		// 0 1 2 3 4 5 6 7 - 여덟개의 숫자를 갖고 한자리 헤아림을 하는 수체계 -> 8진수
		
	}

}

class ClassA{
	
}
