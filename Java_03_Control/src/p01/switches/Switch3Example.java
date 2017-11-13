package p01.switches;

import java.util.Scanner;

/* *
 * switch(조건문){case: break}
 * */
public class Switch3Example {
	public static void main(String[] args) {
		// 계산기 만들기
		//값1 op 값2
		
		int arg1 = 0, arg2=0;
		double result=0.0;
		char op = ' ';
		boolean isContinue = true;
		
		Scanner keyboard = new Scanner(System.in);
		
	while(isContinue) {	//while문 시작
		System.out.println("계산기 프로그램 값1 op 값2 형태");
		System.out.println("첫번째 값을 입력하세요");
		arg1 = keyboard.nextInt();
		
		System.out.println("연산자를 입력하세요(+, -, ㅌ, /)");
		op = keyboard.next().charAt(0);
		
		System.out.println("투번째 값을 입력하세요");
		arg2 = keyboard.nextInt();
		//switch(){}
		switch(op) {
			case '+': result = arg1 + arg2;
					 break;
			case '-': result = arg1 - arg2;
				 break;
			case 'x': result = (double)arg1 * (double)arg2; //강제 형변환(Casting)
				 break;
			case '/': result = (double)arg1 / (double)arg2; //int타입 /int타입의 결과는 int
															//double / double -> double
				 break;
		}

		System.out.println("결과 "+arg1+"과"+arg2+"의 "+op+" 결과는 "+result);
		System.out.println("계속 하시겟습니까?");
		char  c = keyboard.next().charAt(0);
				if (c=='y' || c=='Y') {//동등비교연산
					isContinue = true;
				}
				else {
					isContinue = false;
				}
	}//while문 끝
	System.out.println("종료");
		
	}
}
