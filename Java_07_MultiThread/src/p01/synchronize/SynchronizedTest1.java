package p01.synchronize;

public class SynchronizedTest1 extends Thread {
	public static void main(String[] args) {
		// 객체 생성
		Account2 myAccount = new Account2();

		for (int i = 0; i < 10; i++) {
			//Thread객체 생성
			Thread t = new Thread(new DepositThread2(myAccount));
			//Thread객체의 run()메소드 실행
			t.start();
		}
	}

}
