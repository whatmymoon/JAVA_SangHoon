package days09;
class Tiger{
	private String name;
	private int age;
	private String phone;
	
	public void input(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public void output() {
		System.out.println("저의 이름은 " + name + ", 나이는 " + age + "살입니다");
	}
	
	public void copy1(Tiger t1) {
		this.name = t1.name;
		this.age = t1.age;
		this.phone = t1.phone;
	}
	public Tiger copy2() {
		Tiger temp = new Tiger();
		temp.name = this.name;
		temp.age = this.age;
		temp.phone = this.phone;
		return temp;
	}
}
public class Class11 {

	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		t1.input("야옹이", 10, "010-2222-1111");
		t2.input("냥냥이", 11, "010-3333-1111");
		t1.output();
		t2.output();
		
		System.out.println();
		Tiger t3;
		t3 = t2;  // 참조변수의 참조값 복사
		System.out.println("\nt2가 t3에 복사된 후 t3의 내용------------------------");
		t3.output();
		t2.input("어흥이", 15, "010-8888-9999"); // t2 내용을 바꾸기만 한데 t2,t3내용이 어흥이로 바꿔서 출력됨. -> t2,t3는 참조변수니까!
		System.out.println("\nt2를 다른 내용을 바꾼후 t2와 t3의 내용---------------");
		t2.output();  // t2의 참조값을 t3의 참조값에 대입. 즉, 장소는 하나인데 주소는 t2,t3가 쓰고 있어서 같이 바뀌게 되어있다.
		t3.output();  // call by reference
		
		System.out.println("\n");
		
		Tiger t4 = new Tiger();
		t4.copy1( t1 );  // t1의 멤버변수들의 값을 모두 복사
		t1.output();
		t4.output();
		System.out.println("\n");
		
		t1.input("야옹이", 100, "010-2222-1111");
		t1.output();
		t4.output();
		
		System.out.println("\n\n");
		Tiger t5 = t2.copy2();
		
		t2.output();
		t5.output();
		System.out.println("\n");
		
		t2.input("야옹이", 200, "010-2222-1111");
		t2.output();
		t5.output();
		/*
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = arr1; // 주소 카피
		arr1[3] = 400;
		for(int k : arr1) System.out.printf("%d ", k); // 1 2 3 400 5
		System.out.println();
		for(int k : arr2) System.out.printf("%d ", k); // 1 2 3 400 5
		System.out.println();
		callbyReferenceEx(arr1);
		System.out.println();
		for(int k : arr1) System.out.printf("%d ", k); // 1 2 3 400 500
		System.out.println();
		for(int k : arr2) System.out.printf("%d ", k); // 1 2 3 400 500
		*/
	}

	/*public static void callbyReferenceEx(int[] arr1) {
		arr1[4] = 500;
		for(int k : arr1) System.out.printf("%d ", k); // 1 2 3 400 500
	}  // 참조변수들간에 복사
	 */


}
