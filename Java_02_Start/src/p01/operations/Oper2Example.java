package p01.operations;

import java.util.Scanner;

/* * 
 * 사칙연산
 * */
public class Oper2Example {
	public static void main(String[] args) {
	//콘솔로부터 값을 입력받기 위한 객체(instance)생성
		Scanner scanner = new Scanner(System.in); //System.in입력 스트림
		System.out.println("x값을 입력하세요: ");
		int x = scanner.nextInt(); //입력받은 문자열타입의 값을 int타입으로 변환해서 출력
		System.out.println("y값을 입력하세요: "); //int y = Integer.parseInt(scanner.next());
		String instr = scanner.next(); //scanner.next()는 입력받은 문자열을 문자열로 출력
		int y = Integer.parseInt(instr); //Integer.parseInt()메소드는 ()의 숫자타입의 문자열을 int로 반환
		
		//입력받은 값으로 사칙연산
		//"문자열"+(문자열이 아닌 식의 결과값, 문자열이 아닌값) 의 결과는 "문자열"
		//"x*y="+x*y => "x*y="+x=>"x*y=x"+y=>"x*y=xy"
		//()연산자의 우선순위가 가장 높음. "문자열"+(x*y) =>"문자열"+x*y의 결과값
		//"문자열+x*y의 결과값"
		//println()메소드는 문자열 타입을 출력하는 메소드 // int타입의 리터럴이 문자열 "2"로 바뀌어
		System.out.println(2);						// println()메소드의 매개변수로 전달
		System.out.println("x*y = " + (x*y));
		System.out.println("x/y = " + (x/y)); //int타입 과 int타입의 연산결과는 int(double이 아님)
		System.out.println("x+y = " + (x+y));
		System.out.println("x-y = " + (x-y));
	}
	
}
