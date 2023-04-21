package days09;

class Cat{
	private String name;
	private int age;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	// 여기까지는 마우스로 getter setter 생성
	
	void input(String n, int a, String p) {
		this.name = n; // 매개변수를 멤버변수에 대입
		this.age = a;
		this.phone = p;
	}
	void output() {
		System.out.println("저의 이름은 " + name + ", 나이는 " + age + "살입니다");
	}
	
	
}

public class Class10 {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		c1.setName("냥냥이");
		c1.setAge(10);
		c1.setPhone("010-8888-9999");
		c2.input("야옹이", 5, "010-1234-1234");  // call by reference
		
		c1.output();  // 출력 내용 : 저의 이름은 XXX, 나이는 XX살입니다
		System.out.println("저의 이름은 " + c2.getName() + ", 나이는  " + c2.getAge() + "살입니다");
		// getter 는 값을 return 해주고 setter는 매개변수값을 멤버변수에 저장해줍니다.
		
	}

}
