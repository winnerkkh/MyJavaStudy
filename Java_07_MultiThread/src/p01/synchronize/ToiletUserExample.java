package p01.synchronize;
/* *
 * 한정된 자원을 사용하는
 * 여러개의 쓰레드들의 동기화방법
 *  - wait(),notifyAll()메소드를
 *    이용하여 쓰레드들 끼리 신호를
 *    주고 받아서 처리.
 *    작업의 우선순위는 jvm의 작업
 *    스케줄의 우선순위에 의해 정해짐.
 * */
public class ToiletUserExample {
	public static void main(String[] args) {
		//멀티쓰레드 객체 생성
		TwoToilets twoToilets = new TwoToilets();
		
		for(int i=1;i<=10;i++) {
			//쓰레드 객체 생성
			Thread t 
			     = new Thread(new ToiletThread(twoToilets, "사용자"+i));
			
			//쓰레드 실행 
			t.start();
		}
	}
}

