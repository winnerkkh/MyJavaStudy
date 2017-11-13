package p03.dataTypes;

/* *
 * 기본데이타 타입을 클래스화한 객체를 Wrapper(래퍼)클래스라고 함.
 * */

public class DataType8Example {
	public static void main(String[] args) {
	//변수
		char charValue1 = '가'; //' ' 문자리터럴
		char charValue2 = '한';
		char charValue3 = '글';
		
	//Int타입(값만 저장할수 있음)을
	//객체화한 클래스(값저장 + 메소드)
	//"문자열" 내에서 특수문자(이스케이프문자)표기하는 \후에 문자를 입력
		System.out.println("\'가\'의 2진표기법 " + Integer.toBinaryString(charValue1));
		System.out.println("\'한\'의 2진표기법 " + Integer.toBinaryString(charValue2));
		System.out.println("\'글\'의 2진표기법 " + Integer.toBinaryString(charValue3));
	}
}
