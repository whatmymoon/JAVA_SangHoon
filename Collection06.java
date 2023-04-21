package days13;

import java.util.ArrayList;

class Point{
	
	private int x;
	private int y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public String toString() { return "x : " + x + ", y : " + y; }
	
	//equals 메소드 오버라이딩 시험문제 나옴..
	
	public boolean equals( Object obj ) {
		
		if( !(obj instanceof Point)) return false;
		Point target = (Point) obj;
		boolean result = ((this.x == target.x) && (this.y == target.y));
		return result;
	}
	
}

public class Collection06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		list.add(10); list.add(20); list.add(30); // 10, 20, 30 이라는 값이 어딘가에 저장되어져 있고 참조값을 ArrayList가 리턴받는다.
		int target_index = list.indexOf(20);  // list 에 저장된 값 중 20이 몇번째 데이터인지 리턴
		System.out.printf("20의 위치 : %d\n", target_index);
		
		target_index = list.indexOf(50);  // 검색할 값이 존재하지 않는 경우 -1이 반환
		System.out.printf("50의 위치 : %d\n", target_index);
		
		System.out.printf("20의 저장 유무 : %b\n", list.contains(20));  // .contains() : 찾는 값이 있으면 true, 없으면 false 출력
		System.out.printf("50의 저장 유무 : %b\n", list.contains(50));
		
		ArrayList<Point> pList = new ArrayList</*Point 생략가능*/>();
		Point p = new Point(10, 10);
		pList.add(p);
		pList.add( new Point(20, 20) );
		pList.add( new Point(30, 30) );
		
		for( Point k : pList ) System.out.println(k.toString());
		int index = pList.indexOf( new Point(30, 30) );  // 찾는 값이 있으면 그 인덱스 번째 번호, 없으면 -1이 출력
		System.out.printf("(30, 30)의 위치 : %d\n", index);  // equals() 메소드를 Object 클래스에 있는 그대로를 쓰면 -1이 출력되므로,
		// 메소드 오버라이딩을 통해 찾는 값과 그 ArrayList값을 비교하는 메소드 오버라이딩을 해줘야 합니다.
		// 가능하다면 toString(), equals() 는 오버라이딩 해야합니다.
		
	}

}
