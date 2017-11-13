package p03.dataTypes;
/* *
 * 데이타 타입
 * 변수에 값을 초기화 하기 위한 값(리터럴) 을 숫자로 표시할때.
 * 정수, 8진수, 16진수로 표기할수 있음.
 * 8진수 리터럴은 숫자앞에 0을 붙임 010.
 * 16진수 리터럴은 숫자앞에 0x를 붙임 0x10
 * */

public class DataType5Example {

	public static void main(String[] args) {
		int var1 = 10; //10진수 리터럴
		int var2 = 010; //8진수 리터럴 => 0*1+0
		int var3 = 0x10; // 16진수 리터럴 => 16*1+0
		System.out.println("var1= " + var1);
		System.out.println("var2= " + var2);
		System.out.println("var3= " + var3);
		
		//기존에 선언했다면 따로 변수에 데이타 타입을 설정하지 않아도된다.
		//32로 출력
		var1 = 32; //10진법
		var2 = 040; // 8*4+0
		var3 = 0x20; //16*2+0
		System.out.println("var1= " + var1);
		System.out.println("var2= " + var2);
		System.out.println("var3= " + var3);
		
		
		int var4 = 10; //10진법
		int var5 = 012; // 8진법
		int var6 = 0x0A; // 16진법
		System.out.println("var4= " + var4);
		System.out.println("var5= " + var5);
		System.out.println("var6= " + var6);
		
		
	}
	
	
}
