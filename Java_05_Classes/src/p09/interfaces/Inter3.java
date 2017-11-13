package p09.interfaces;

public class Inter3 {
	public static void main(String[] args) {
		// 인터페이스의 구현
		// 구현체의 객체 생성후 안터페이스참조변수에 대입
		// f4 f = new F3();

		F3 f3 = new F4();
		f3.aa();
		f3.bb();
		f3.cc();

		// 클래스의 구현
		F5 f5 = new F5();
		f5.aa();
		f5.bb();
	}
}