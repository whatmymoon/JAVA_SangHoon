package days14;

// 프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을 때는 원래 갖고 있는 메인 Thread 외에
// Thread 클래스를 추가 사용하여 실행시킬 수 있습니다.
// Thread Class : 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스.

// 구현방법 : 프로그램에 Thread 를 추가해서 필요한 작업이 동시에 일어나게 구현
// 1. Thread 클래스를 상속받는 방법
//		1-1. Thread 클래스를 상속받아 public void run() 메서드를 오버로딩합니다.
//			public void run() : 쓰레드가 생성되어 수행할 작업을 정의하는 메서드,
//		1-2 해당 클래스의 객체를 생성하고, start 메서드를 호출(실행)합니다.
//			만약 오버라이딩된 run 메서드를 호출하면, 쓰레드 생성실행이 아니라, 일반 메서드 호출이
//			되므로 반드시 start 메서드를 통해 run 으로 이어지게 호출합니다.
//			start 메서드 : Thread 클래스(부모 클래스) 에 있는 메서드로, 자체적으로 쓰레드 추가 생성 후
//			run 메서드를 재호출하는 역할을 합니다.(상속된 메서드로 메서드가 표면에 보여지지 않은 채 사용됩니다.)
// 2. Runnalbe 인터페이스를implemetns(구현)하는 방법
//

class ThreadB1 extends Thread{
	public void run() {
		for( int i = 1; i <=10; i++) {
			System.out.println("ThreadB1 : " + i);
			try {
				sleep(100);  // 0.1초간 휴식
				// sleep 메서드는 Thread 클래스에 있는 static메서드입니다.
				// 사용할 때 Thread.sleep() 으로 사용해야 하지만 현재 위치는 자기 자신의 클래스
				// 내부이기도하므로 sleep() 으로만 사용해도 됩니다.
				// 또한 프로세서 실행에 관여하는 명령이라서 예외처리가 따라다닙니다.
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

class ThreadB2 extends Thread{
	public void run() {
		for( int i = 1; i <= 10; i++) {
			System.out.println("ThreadB2 : " + i);
			try {
				sleep(100);  // 0.1초간 휴식
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
public class Thread02 {
	
	public static void main(String[] args) {
		ThreadB1 b1 = new ThreadB1();
		ThreadB2 b2 = new ThreadB2();
		//b1.run();
		//b2.run(); // run 메서드를 직접 호출하는 것은 추가 쓰레드 생성없이 단순호출. 앞선 예제와 같은 결과가 나옵니다.
		b1.start();
		b2.start();  // start() : 별도의 쓰레드 생성 & 실행
		for(int i =1; i<=10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try {
				Thread.sleep(100);  // 0.1초간 휴식
				// Thread 클래스 내부가 아니므로 Thread.sleep(100); 와 같이 호출 실행합니다.
			} catch (InterruptedException e) { e.printStackTrace(); }
		}

	}

}
