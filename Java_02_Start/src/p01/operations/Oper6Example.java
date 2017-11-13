package p01.operations;
import java.util.Scanner;
/* *
 * 삼항 연산자
 * 	조건식 ? 참 : 거짓
 * 				조건?참:거짓
 *						조건?참:거짓
 *						       조건?참:거짓
 * */

public class Oper6Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		//next() 키보드로 입력된 문자열 값을 문자열로 리턴하는 메소드
		int score = scanner.nextInt(); 
		//String score = scanner.next();
		//Integer.parseInt(score);
		char grade = ' '; //char타입의 초기화시 빈문자는 ' '로 초기화
		//삼항연산자를 이용하여 grade를 출력하세요.
		grade = score>=90 ? 'A' : (score>=80 ? 'B': (score >= 70 ? 'C' : 'F'));
		System.out.println("등급: " + grade);

	}
}

