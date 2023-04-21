package days14;

public class Exception03 {

	public static void main(String[] args) {
		// catch구문은 발생한 예외에 따라 선택적으로 실행됩니다.
		try {
			// ArithmeticException 등의 클래스들을 이용해 객체를 만들고 그 객체로 에러를 일부러 발생시킬 수 있습니다.
			ArithmeticException a = new ArithmeticException ("ArithmeticException 고의 발생");
			throw a;  // 예외상황 강제 발생
		}catch( ArithmeticException e ) {
			System.out.printf("ArithmeticException - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}catch( RuntimeException e ) {
			System.out.printf("(\"RuntimeException - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}catch( Exception e ) {
			System.out.printf("Exception - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		
		try {
			RuntimeException a = new RuntimeException("RuntimeException 고의 발생");
			throw a;
		}catch( ArithmeticException e ) {
			System.out.printf("ArithmeticException - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}catch( RuntimeException e ) {
			System.out.printf("(\"RuntimeException - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}catch( Exception e ) {
			System.out.printf("Exception - ");
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		
	}

}
