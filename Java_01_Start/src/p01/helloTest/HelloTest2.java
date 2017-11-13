package p01.helloTest;

public class HelloTest2 extends Object {

		
		/*
		 * Java의 모든 클래스는 최상위 클래스인 Object클래스로부터
		 * 상속(Object클래스의 속성과 메소드를 물려받는것)을 받아 생성된다.
		 * -생성자.
		 * -클래스명과 동일한 이름을 가진 메소드, 리턴부분이 없음.
		 * -생성자의 역할: 객체의 생성시 초기화를 위한 용도.
		 * -클래스에서 매개변수가 없는 생성자(default 생성자)를
		 *  쓰지 않으면, 컴파일시 JVM(Java Virtual Machine)생성자를
		 *  주입하여 컴파일함.
		 */
		
		//생성자(Constructor)
		HelloTest2(){
			System.out.println("생성자");
		}
		
		//메소드(Method)
		public static void main(String[] args) {
		System.out.println("안녕하세요");
		}
}
