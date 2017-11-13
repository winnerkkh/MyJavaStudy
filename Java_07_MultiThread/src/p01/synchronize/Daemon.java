package p01.synchronize;

public class Daemon extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("저장");
			
			try {
				Thread.sleep(1000); //1초 정지 후 실행	
				
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
				
			}
		}
	}

}
