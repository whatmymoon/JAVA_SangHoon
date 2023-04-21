package days02;

//연산자
//산술 - 사(오)칙연산자 : +, -, /, *, %   16+3->19   16-3->13   16/3->5.333333   16*3->48   16%3->1
//관계연산자-비교연산자 : >, <, >=, <=, ==, !=   결과는 true,false/ 변수 boolean
//논리 연산자 : &&(And), ||(Or), !(Not)

public class Operator01 {

	public static void main(String[] args) {
		
		int n1 = 10, n2 = 7, result1;
		double result2;
		
		result1 = n1 + n2;
		System.out.printf("%d + %d = %d\n", n1, n2, result1);
		result1 = n1 - n2;
		System.out.printf("%d - %d = %d\n", n1, n2, result1);
		result1 = n1 * n2;
		System.out.printf("%d * %d = %d\n", n1, n2, result1);
		result2 = n1 / (double)n2;
		System.out.println(n1 + " / " + n2 + " = " + (int)(result2*100)/100.0);
		System.out.printf("%d / %d = %.2f\n", n1, n2, result2);
		result1 = n1 % n2;
		System.out.printf("%d %% %d = %d\n", n1, n2, result1);
		// 큰 따옴표안에 '%'은 연산기호가 아니라 표시하기 위함으로 '%%'을 쓴다.
		System.out.println();
		
		int n = 50;
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		n = n + 10; // n +=10;
		//	1. 현재 n값(50) 과 두번째 피연산자인 10이 CPU로 전달되어 덧셈됩니다.
		//	2. 연산결과가 돌아와서 다시 n 변수에 저장됩니다.
		//	연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n변수에 남습니다.
		//	간략하게 다음과같이도 사용합니다. n+=10;
		System.out.println("n = n + 10 -> n : " + n);
		
		n = n-10; //n-=10;
		System.out.println("n = n - 10 -> n : " + n);
		n = n*10; //n*=10;
		System.out.println("n = n * 10 -> n : " + n);
		n = n%10; //n%=10;
		System.out.println("n = n % 10 -> n : " + n);
		
		double d = 50.0;
		System.out.println("d 의 최초값 : " + d);
		d = d/10.0; //d/=10; d = d/10해도 결과값이 똑같다.
		System.out.println("d = d / 10 -> d : " + d);
		System.out.println();
		
		// n = n + 1;   n = n - 1;
		// n+=1;   n-=1;
		// n++   n--
		// 이 세줄이 다 같은 연산이다!
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 값을 변경합니다.   n++   n--
		
		n = 50;
		n++;
		System.out.println("n++ -> " + n);
		++n;
		System.out.println("n++ -> " + n);
		n--;
		System.out.println("n++ -> " + n);
		--n;
		System.out.println("n-- -> " + n);
		System.out.println();
		// 위와 같은 단항연산일때는 ++나 --를 앞또는 뒤에 어느곳에 붙여도 똑같이 연산됩니다.
		
		// ++, -- 연산이 앞 또는 뒤에 있을때 차이가 나는 경우는 다른 연산과 섞여있을때 차이가 생깁니다
		n = 10;
		System.out.println("현재 n값 : " + n);
		
		int k = n++; // 정수 k에 n을 대입한 뒤 n 값을 증가한다.
		System.out.println("k : " + k);
		System.out.println("n : " + n);
		System.out.println();
		
		n = 10;
		System.out.println("현재 n값 : " + n);
		k = ++n; // n 값을 증가한 뒤 정수 k에 n 값을 대입한다.
		System.out.println("k : " + k);
		System.out.println("n : " + n);
		System.out.println();
		
	}

}
