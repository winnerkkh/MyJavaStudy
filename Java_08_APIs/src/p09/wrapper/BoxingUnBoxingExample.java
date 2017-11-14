package p09.wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {

		// Boxing - 기본데이타 타입을 =>클래스화 시킴
		Integer obj1 = new Integer(100); // int타입
		Integer obj2 = new Integer("200"); // 숫자형 문자열
		Integer obj3 = Integer.valueOf("300"); // 숫자형 문자열

		// Unboxing - 객체를 기본데이타 타입으로 변환
		int value1 = obj1.intValue(); // Integer값을 int타입으로 변환
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		// 자동 박싱
		Integer obj = 100; // int -> Integer로 자동 변환
		System.out.println("value: " + obj.intValue());
		// 자동 unBoxing
		int value = obj; // Integer -> int로 자동변환 (obj.intValue())
		// 연산중 자동 unBoxing
		int result = obj + 100; // obj -> int로 변환 후 int 100과 연산
		// 값 변환 숫자형 문자열-> 숫자로 변환
		int value4 = Integer.parseInt("10");
		double value5 = Double.parseDouble("3.14");
		boolean value6 = Boolean.parseBoolean("true");
		String value7 = String.valueOf(value6); //boolean타입의 값을 "true"문자열로 변환
	}

}
