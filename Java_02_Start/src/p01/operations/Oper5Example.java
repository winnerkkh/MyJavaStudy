package p01.operations;

public class Oper5Example {
/* *
 * 조건연산(삼항연산자)
 * 조건식 ? 참 : 거짓
 * */
	
	public static void main(String[] args) {
		//변수 선언
		int a = 20, b = 30, max;
		
		//조건 연산식
		
		max = a<b ? a : b;
		System.out.println(max);
		
		//조건문
		if(a<b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println(max);
		
		
		int score = 95;
		char grade = ' '; //char타입의 변수 초기화시 빈 문자로 초기화(' ')
						  //String에서 변수 초기화시 ""빈공백없이 가능.
		
		if(score>=90) {
			grade = 'A';
		} 
		
		else {
			grade = 'B';
		}
		System.out.println("Grade= " + grade);
		
		grade = (score >=90) ? 'A': 'B';
		System.out.println("Grade= " +grade);
		
		
		
		
		
	}
}
