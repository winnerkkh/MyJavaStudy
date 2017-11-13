package p01.operations;

/* * 
 * 비트 연산자(&. |, ^, ~)
 * */

public class BitOper1Example {
	public static void main(String[] args) {
		int num1 = 0xFFFF0000;
		int num2 = 0xFF00FF00;
		
		System.out.println("num1= " + num1);
		System.out.println("num1= " + num2);
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		
		//Ctrl + F => has a function to search the letter and replace correct word you want
		int result1 = num1&num2;
		int result2 = num1|num2;
		int result3 = num1^num2;
		int result4 = ~num1;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
		System.out.println("result4= " + result4);
		
		//printf()문 문장을 출력시 format을 사용
		//printf("%08x", 변수) => 변수의 값이 8자리의 16진수로 표시
		System.out.printf("%08x %n",result1);
		System.out.printf("%08x %n",result2);
		System.out.printf("%08x %n",result3);
		System.out.printf("%08x %n",result4);
		System.out.println(Integer.toBinaryString(result1));
		System.out.println(Integer.toBinaryString(result2));
		System.out.println(Integer.toBinaryString(result3));
		System.out.println(Integer.toBinaryString(result4));
		
	}			
}
