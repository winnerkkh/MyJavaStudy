package p01.operations;
import java.util.Scanner;
/**
 * 삼항연산자
 *  조건식? 참:거짓
 *            조건?참:거짓
 *                   조건?참:거짓
 *                          조건?참:거짓
 * */
public class OperE66Example {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean isContinue=true;//
	while(isContinue) {//boolean타입의 값은 제어문(반복문)의 제어에 사용
	    System.out.println("점수를 입력하세요");
	    //next() 키보드로 입력된문자열 값을 문자열로 리턴하는 메소드
	    int score =Integer.parseInt(scanner.next());//오류 처리
	    char grade = ' ';//char타입의 초기화시 빈문자는 ' '로 초기화
	    //삼항연산자를 이용하여 grade를 출력하세요.
	    grade = score>90?'A':score>80?'B':score>70?'C':'F';
		System.out.println("등급:"+grade);
		System.out.println("계속하시겠습니까");
		//charAt(index) 메소드는 문자열에서 해당index번지의 문자하나를 추출하는 메소드
		char yesNo = scanner.next().charAt(0);
		isContinue=(yesNo=='y'||yesNo=='Y')?true:false;		
		 }//반복문의 끝
	   System.out.println("종료");
	}
}







