package days13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Formatter01 {

	public static void main(String[] args) throws ParseException {
		
		// 날짜 데이터 클래스, Calendar 와는 다름
		Date today = new Date();  // java.util.Date
		System.out.println(today);
		
		// 날짜 서식 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");  // 전달인수로 서식을 제공
		// 날짜 데이터를 서식 데이터에 맞춰서 적용후 출력
		System.out.println(sdf1.format(today));
		
		// 날짜 서식 레퍼런스 변수들
		SimpleDateFormat sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		// today 적용 후 출력
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		// y : 년도를 표시할 자리수 문자(yyyy:2020, yy: 20))
		// M : 월을 표시할 자리수 문자(MM: 01~12,  M : 1 ~ 12)
		// d : 일을 표시하는 자리수 문자(dd :01~31 d:1~~31)
		// H : 시에 해당하는 자리수 문자(HH : 01~23 H : 1~23)
		// h : 시에 해당하는 자리수 문자( hh : 01~12 h : 1~12)
		// m :분 // s : 초 // S: 밀리초 // a: 오전/오후
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 날입니다.");
		
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
		// Calendar 객체값을 Date 값으로 변환 후 SimpleDateFormat에 적용
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(day));  // format(Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
		
		// SimpleDateFormat에는 String 데이터를 날짜 자료형으로 변경하는 메서드가 존재합니다.
		// Date 자료형을 String 으로 변경  String.valueOf() 를 쓰거나 날짜데이터 뒤에 +"" 로 연산하거나
		// String strDate = sdf1.format(day) +"";
		// String strDate = String.valueOf(sdf1.format(day));
		
		// 반대로 String -> Date
		String strDate = "2023-03-31";
		// 적용한 String 데이터에 날짜 양식에 맞춰서 SimpleDateFormat 객체를 생성
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		// 그 양식에 String 데이터를 적용
		Date newDate = sdf1.parse( strDate );
		
		sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2.format( newDate ));
	
	}

}
