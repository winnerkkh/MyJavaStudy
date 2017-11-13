package p01.continues;
/* *
 * Continue문;
 * */

public class Continue1Example {
	public static void main(String[] args) {
		
		int i =0; //main메소드의 로컬변수
		for(i=0; i<=10; i++) {
			System.out.println("\t i= " + i);
			if(i>5) { //반복문 블럭을 빠져나가는 break;문
				break;
			}
			System.out.println("\t i= " + i);
		}
		System.out.println("\t i= " + i);
		System.out.println("------------------");
		for(i=0; i<=10; i++) {
		System.out.println("\t i= " + i);
			if(i>5) {
				continue; //반복문 블럭내에서 continue;문 아래의 명령문을 skip하는 문;
			}
			System.out.println("\t i= " + i);
		}
		System.out.println("i= " + i);
	}
}
