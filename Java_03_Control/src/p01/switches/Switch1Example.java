package p01.switches;

import java.util.Scanner;

/* *
 * 조건문 - Switch문
 * 		 switch(조건) - 조건에 따라 미리 실행할 작업을 분기해놓은 제어문
 * */
public class Switch1Example {
	public static void main(String[] args) {
		int score=0;
		String grade = "";
		//case에 따라 분기 
		// 98 -> 98/10 =>9.8 (int)타입이므로 9가 됨
		
		boolean isContinue = true;
		while(isContinue) {
		Scanner keyboard = new Scanner(System.in);
		score = keyboard.nextInt();
		switch(score/10) {
			case 10: //break문이 없으면 아래 case문까지 실행됨.
			case 9: grade="A"; break; //break문이 있어서 해당 case문만 실행하고 switch()문을 벗어남
			case 8: grade="B"; break; //break문이 있어서 해당 case문만 실행하고 switch()문을 벗어남
			case 7: grade="C"; break; //break문이 있어서 해당 case문만 실행하고 switch()문을 벗어남
			case 6: grade="D"; break; //break문이 있어서 해당 case문만 실행하고 switch()문을 벗어남
			default: grade= "F";
		}
		//if 중첩문
		if(score >= 60 && score <100) {
			if(score%10>7) grade +="+";
			else if(score%10<4) grade += "-";
			else grade +="0";
		}
		System.out.println("등급은 "+grade);
		System.out.println("계속 할까요?");
		//char타입의 값을 'y'와 비교연산자 (==)로 비교 ->char타입은 기본데이타타입이므로 ==연산자로 비교가능
		if(keyboard.next().equalsIgnoreCase("y")) { // 문자열로 받음
			//equalsIgnoreCase("문자열") - 문자열 비교 메소드
			isContinue = true;
		}
		else {
			isContinue = false;
		}
		System.out.println("종료");	
		}
		
		
    }
}