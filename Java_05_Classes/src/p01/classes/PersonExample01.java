package p01.classes;
/* *
 * 객체(Object)는 속성과 기능을 가진 개념적 관점.
 * 클래스는 객체를 만들기 위한 설계도.
 * 자바에서 클래스를 가지고 생성한 객체를 instance라고 함.
 * */




public class PersonExample01 {
	public static void main(String[] args) {

		//객체생성(instance 생성) - 이 과정에서 instance라고 불림.
		//객체의 선언
		// 타입 참조변수;
		// 객체의 생성 new 타입(); => new 생성자();
		Person person = new Person(); //
		person = new Person("홍길동", 18); // 객체 생성 직후 초기화 작업(초기값 입력) 
		
		//현재클래스와 Person클래스와의 관계 (사용)
		person.smile(); // 사용 -> 참조변수.메소드() 가능을 호출하여 사용
		person.eat(); // 사용-> 참조변수.메소드()
		
	}

}
