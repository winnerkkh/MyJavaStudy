package p03.dataTypes;
/* *
 * data 타입, 리터럴,
 * data 타입
 *  - 정수타입, 실수타입
 *  - 정수타입의 기본타입은 int: ex) 10은 int타입의 10으로 인식,
 *  							  010으로 표시하면 8진수로,
 *  							  0x10으로 표시하면 16진수로 인식.
 *  -실수 타입의 기본타입은 double: ex) 12.375는 double 타입 12.375로 인식,
 *  								 12.375f로 표시하면 float타입의 12.375로 인식.
 *  -10의 승수로 표시가능	ex)2e3, 2e-6 등으로 숫자 중간에 e를 넣어서 표시함
 * */	

public class DataType6Example {
	public static void main(String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14; //floats는 실수타입의 기본타입이 아니므로 실수리터럴뒤에 f를 붙지 않아서 오류
		float var3 = 3.14f; //실수리터럴 + f로 표시된 float타입의 리터럴
		
		double var4 = 0.1234567890123456789;  
		float var5 = 0.1234567890123456789f; //float인 경우 리터럴f를 붙여줘야함!
		
		System.out.println("var1= " + var1);
		System.out.println("var3= " + var3);
		System.out.println("var4= " + var4); //출력시 소수부분은 double타입에서 인정하는 정도까지 출력 
		System.out.println("var5= " + var5); //출력시 소수부분은 float타입에서 인정하는 정도까지 출력
		
		int var6 = 3000000;
		double var7 = 3e6; //3*10^6
		float var8 = 3e6f; //3*10^6
		double var9 = 2e-3;//3*10^(-3)
		
		System.out.println("var6= " + var6 );
		System.out.println("var7= " + var7 );
		System.out.println("var8= " + var8 );
		System.out.println("var9= " + var9 );
	}
	
}
