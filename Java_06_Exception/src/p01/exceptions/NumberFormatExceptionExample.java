package p01.exceptions;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		
		try {
			String data1 = "100"; //숫자형 문자열을 data1에 대입
			String data2 = "a100"; //일반문자열을 data2에 대입
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			int result = val1+val2;
			System.out.println("결과: " + result);
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
