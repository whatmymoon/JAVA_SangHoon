package days17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		// InputStreamReader a = new inputStreamReader(System.in);
		// BufferedReader b = new BufferedReader(a);
		
		String input;
		//BufferedReader 클래스의 객체를 사용하여 String 타입 자료를 읽어 온 후 형변환을 시행합니다.
		System.out.print("정수 입력하세요 : ");
		input = br.readLine();  // 비록 읽어내는 것은 String 으로 읽어 내지만 아래에서 정수변환을 사용합니다.
		int num = Integer.parseInt(input);  // 입력된 문자열을 정수로 변환
		System.out.printf("입력된 정수 : %d\n", num);
		
		System.out.print("실수 입력하세요 : ");
		input = br.readLine();
		double d = Double.parseDouble(input);  // 입력된 문자열을 실수로 변환
		System.out.printf("입력된 실수 : %.2f\n", d);
		
		System.out.print("문자를 입력하세요 : ");
		char ch = (char)br.read();
		System.out.printf("입력된 문자 : %c\n", ch);
		br.close();

	}

}
