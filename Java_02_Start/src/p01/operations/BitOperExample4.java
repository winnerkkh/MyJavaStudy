package p01.operations;

public class BitOperExample4 {

	public static void main(String[] args) {
		int num1 = 0xFFFFFFFF;
		System.out.println(Integer.toBinaryString(num1));
		int num2 = num1 << 30;
		int num3 = num1 << 31;
		int num4 = num1 << 32;
		int num5 = num1 << 33;
		int num6 = num1 << 34;
		
		System.out.println(Integer.toBinaryString(num2));
		System.out.println(Integer.toBinaryString(num3));
		System.out.println(Integer.toBinaryString(num4));
		System.out.println(Integer.toBinaryString(num5));
		System.out.println(Integer.toBinaryString(num6));
	
		//printf()
		System.out.printf("%08x %n", num1); 
		System.out.printf("%08x %n", num2);
		System.out.printf("%08x %n", num3);
		System.out.printf("%08x %n", num4);
		System.out.printf("%08x %n", num5);
		System.out.printf("%08x %n", num6);
	}
}
