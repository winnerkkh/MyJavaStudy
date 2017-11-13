package p01.synchronize;

public class TwoToilets {
	// 필드
	private String User1;
	private String User2;
	private boolean is_1_Empty;// flag
	private boolean is_2_Empty;// flag

	// 생성자
	public TwoToilets() {
		is_1_Empty = true;// 빈 상태
		is_2_Empty = true;// 빈 상태
	}

	// 메소드
	public synchronized void use(String userName) throws InterruptedException {
		while ((is_1_Empty == false) && (is_2_Empty == false))
			wait(); // 다른 쓰레드들에게 wait신호를 보냄
		// 비어있지 않은 상태 이면 기다림
		
		if (is_1_Empty == true) {// 비어있는 상태
			User1 = userName;// 점유
			is_1_Empty = false;// flag를 사용중으로 바꿈
			System.out.println("화장실1:" + User1 + "사용 중...");
		} 
		
		else if (is_2_Empty == true) {
			User2 = userName;// 점유
			is_2_Empty = false;// flag를 사용중으로 바꿈
			System.out.println("화장실2:" + User2 + "사용 중...");
		}
	}

	public synchronized void done(String userName) {
		if (userName.equals(User1)) {// 매개변수로 받은 이름과 사용중인 이름같으면
			User1 = null;// 이름 삭제
			is_1_Empty = true;// flag를 사용중 -> 비어있는 상태로 바꿈
			System.out.println("화장실1:" + userName + "사용 완료,현재 비어있음");
		} 
		
		else if (userName.equals(User2)) {// 매개변수로 받은 이름과 사용중인 이름같으면
			User2 = null;// 이름 삭제
			is_2_Empty = true;// flag를 사용중 -> 비어있는 상태로 바꿈
			System.out.println("화장실2:" + userName + "사용 완료,현재 비어있음");
		}
		
		notifyAll();// 기다리는 쓰레드들에게
					// 작업이 완료됬음을 알리는 메소드
	}

}
