package p01.operations;
/**
 * 문자열타입의 값과 다른타입의 연산결과는 문자열타입의 값이 나옴.
 * - 문자열에서 '+'는 문자열 결합연산자
 * */
public class StringOperExample1 {
	public static void main(String[] args) {
		String str = "JDK";
		System.out.println(str+10.1); //문자열타입데이타 + 문자열타입이 아닌 데이터 연산 결과는 문자열 타입	
		String str2 = "특징";
		int i = 7;
		System.out.println(i+str2);
	}
}
