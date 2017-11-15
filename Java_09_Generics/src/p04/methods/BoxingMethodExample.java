package p04.methods;

import p02.generics.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		
		//메소드 호출 <터입> 메소드(값);
		Box<Integer> box2 = Util.<Integer>boxing(100);
		int intValue = box2.get();
		System.out.println(intValue);
		
		//메소드 호출  메소드(값);
		Box<String> box3 = Util.boxing("홍길동");
		String strValue = box3.get();
		System.out.println(strValue);
	}
}
