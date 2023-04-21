package days10;

class Student3{
	private int bunho;
	private String name;
	private int [] scores;
	static int count = 0;
	
	Student3(){  // 생성자 1
		scores = new int[4];
		count++;
		bunho = count;
		System.out.println("생성자 1 호출");
	}
	
	Student3(String name){  // 생성자 2
		this();
		this.name = name;
		// this 키워드의 첫째 용도와 두번째 용도가 모두 사용
		System.out.println("생성자 2 호출");
	}
	
	Student3(String name, int k, int m, int e){  // 생성자 3
		this(name);
		scores[0] = k;
		scores[1] = m;
		scores[2] = e;
		System.out.println("생성자 3 호출");
	}
}

public class Class24 {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3();
		Student3 s2 = new Student3("홍길서");
		Student3 s3 = new Student3("홍길동", 56, 99, 55);
		
	}

}
