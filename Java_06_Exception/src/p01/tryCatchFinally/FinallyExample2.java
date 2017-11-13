package p01.tryCatchFinally;
/* *
 * System.exit() 메소드
 * exit()메소드의 값이 0 이면 정상종료,
 *                  0 이 아니면 비정상 종료
 * finally절은 프로그램이 정상/비정상이든 상관 없이
 * 		  종료시 반드시 실행하는 블럭{}이지만,
 * 		 system.exit()메소드를 사용하면
 *       finally{}절은 실행되지 않고 강제로 종료됨. 
 *                  
 *                  
 * */
public class FinallyExample2 {
	static void method(boolean b) {
		
		try {
			System.out.println(1);
			if (b) {
				System.exit(0); //프로그램 종료(정상종료)
			}
			System.out.println(2);
			
		} catch (RuntimeException re) {
			System.out.println(3);
			return;
			
		} catch (Exception e) {
			System.out.println(4);
			return;
			
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}

	public static void main(String[] args) {
		//method(true);
		method(false);
	}

}
