package p01.synchronize;
/* *
 * 데몬쓰레드
 *  - 주쓰레드의 보조역할을 하는 쓰레드
 *  - 주쓰레드가 종료되면 보조쓰레드도 종료됨.
 *  - 일반쓰레드를 데몬쓰레드로 바꾸는 방법
 *    데몬참조변수.setDaemon(true);
 * */

public class DaemonTestExample {
	public static void main(String[] args) {
		//객체 생성
		Daemon daemon = new Daemon();
		daemon.setDaemon(true); //일반 쓰레드 객체의 데몬쓰레드 화
		daemon.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	
	}
}
