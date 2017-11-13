package p03.dataTypes;
/* *
 * 데이타 타입
 * - 기본데이타 타입
 * */
public class DataTypesExample {

	public static void main(String[] args) {
		//로컬변수
		byte var1 = 127; //byte 타입 - 길이 1byte
		char c = 'a'; //char 타입 - 길이 2byte
		char c2 = '\uac00'; //unicode로 구성된 값        \<-- 유니코드를 쓰겟다라는 의미임.
		int a = 100; // int 타입 - 길이 4byte
		double d = 34.53; //double 타입 - 길이 8byte
		
		
		System.out.println(c2);
		
		System.out.println(var1+1); //byte타입의 값과 int타입의 값1의 연산 결과
		//var1= var1+1; //오류발생 변수와의 타입범위를 벗어난 값이 대입되므로 오류
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
		//데이타 타입의 범위
		System.out.println(Byte.MIN_VALUE + "<=byte 타입의 값의 범위<=" + Byte.MAX_VALUE);
		//System.out.println(Character.MIN_VALUE + "<=char 타입의 값의 범위<=" + Character.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "<=int 타입의 값의 범위<=" + Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "<=double 타입의 값의 범위<=" + Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + "<=float 타입의 값의 범위<=" + Float.MAX_VALUE);
	}

}
