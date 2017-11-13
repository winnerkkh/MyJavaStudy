package p03.dataTypes;
/* *
 * 테이타 타입
 * - 자바 프로그램에서
 *   연산은 반드시 동일한 타입끼리 연산을 함.
 * - 변수 선언시 초기값으로 입력한 값을 literal이라고함.
 *   literal도 데이타타입을 가짐.
 * - 연산중간값도 (such as a syntax of "a+b") 타입을 가짐.
 *   타입변화될때는 작은타입데이타 타입이 큰 데이타 타입으로 자동변환됨.
 *   byte -> short -> int -> long -> float -> double 
 *   10진수 12.375 숫자 -> 2진수로 바꾸기 -> 1100.011(2진수)
 * 
 *   
 *   
 * */



public class DataType3Example {
	public static void main(String[] args) {
		double result;
		// '='는 대입연산자 1이라는 정수타입의 리터럴을 정수타입의 변수 a에 대입하라는 의미
		int a = 1; //연산자(=)를 기준으로 왼쪽과 오른쪽이 타입이 같아야함.
		int b = 2; // 
		double c = 0.5; // 0.5더블타입값을 더블타입의 변수 c에 대입하라는 의미
		result = (a+b) * c; // int타입 a와 int타입 b가 연산을 함. 
							// 결과는 int ()안의 연산을 한 결과는 int값과 *연산을 하는 
							// c는 double임.
							// *연산을 기준으로 왼쪽은 int 오른쪽은 double
							// 이때 int가 double로 타입이 자동 변경
							// double*double형식으로 바뀌어서 double이 됨.
		System.out.println("result= " + result);
	}
}
