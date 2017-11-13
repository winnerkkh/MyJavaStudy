package p01.priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000000; i++) {
		}
		System.out.println(getName());//실행중인 쓰레드 이름 출력
	}

}
