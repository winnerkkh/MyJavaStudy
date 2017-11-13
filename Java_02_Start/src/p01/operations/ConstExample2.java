package p01.operations;

import java.util.Scanner; //Scanner 클래스는 Java/.until패키지에 있음

/* * 
 * final 키워드를 사용하여 PI라는 상수를 선언 후 사용.
 * */

public class ConstExample2 {
	public static void main(String[] args) {
		//원이 넓이 구하기
		//원의 넓이 반지름*반지름*PI
	 final double PI = 3.14d;
	 Scanner keyboard = new Scanner(System.in); //콘솔로부터 입력받기 위한 scanner객체 생성
	 
	 //반복문
	 try {
	 while(true) { //while()문 ()안이 true일 동안 반복 
	 System.out.println("구하기 원하는 원의 반지름을 입력하세요!");
	 int r = keyboard.nextInt();
	 System.out.println("원의 넓이는 :" +r*r*PI);
	 System.out.print("계속 하시겟습니까?");
	 String yesNo = keyboard.next();//  //Striing으로 입력된 값을 String으로 변환
	 //	if(!(yesNo.charAt(0) == 'y' || yesNo.charAt(0) == 'Y'))//CharAt(0):문자열 첫번째 문자를 반환.
	 	//	break; // 제어문(반복문)을 빠져나가는 명령문
	// }
	 
	 	if(yesNo.charAt(0) == 'n' || yesNo.charAt(0) == 'N')//CharAt(0):문자열 첫번째 문자를 반환.
	 		break; // 제어문(반복문)을 빠져나가는 명령문
	 	else {
	 		continue; //계속 진행
	 	}
	 }
	 	System.out.println("종료");
	 	
	 	//자바에서 예외(Exception)도 객체
	}catch(java.util.InputMismatchException e) {
		System.out.println("오류발생" + e.getMessage());
	}//try{실행할 명령문} catch(발생할 예외) { 예외시 처리문}
	 //자바에서 예외는 두가지
	 // -1.checked Exception:문법관련 오류를 컴파일시 체크
	 // -2.unchecked Exception(RuntimeException): 문법적 오류는 없으나 
	 //                        프로그램 실행시 입력자의 입력값 오류,
	 //						   연산 오류에 의해 발생하는 예외
	 
	}
}
