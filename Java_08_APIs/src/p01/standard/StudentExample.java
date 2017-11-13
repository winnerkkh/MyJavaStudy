package p01.standard;

public class StudentExample {
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);
		
		
		//객체가 다르기 떄문에 다른인물로 인식하였지만 (다른 객체로 취급) even tho the values inside are the same as the other object' values.
		//equals 메쏘드를 재정의하여 같은 인물로 확인.
		System.out.println("student1의 저장 번지값:" + student1.hashCode());
		System.out.println("student1의 저장 번지값:" + student2.hashCode());
		
		//
		if(student1.equals(student2)) {
			System.out.println("동일인물입니다.");
		}else
			System.out.println("다른인물입니다.");
	}
	
}

