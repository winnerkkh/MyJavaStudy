package p01.operations;

/* * 
 * 논리연산 부정 !
 * - true -> false, false => true
 * - 조건문 if()는 ()안의 값이 true, ()안의 식의 결과가 true이면 true
 * */

public class NotOperExample1 {
	public static void main(String[] args) {
		boolean stop = false; //초기값이 false 
		
		if(!stop) {
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
		
		if(stop != true) { //stop==true => stop != true =>결과값 true
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
	}
	
}
