package p01.lambdas;

/* *
 * 로컬 메소드 내에서 선언된 람다식에서
 *  사용되는 매개변수 및 로컬변수는 모두 final이다.
 * */

public class UsingLocalVariableExample {

	public static void main(String[] args) {
		UsingLocalVariableExample f1 = new UsingLocalVariableExample();
		f1.method(10);
		System.out.println();

	}

	void method(int arg) {// 매개변수가 있는 메소드, final
		int localVar = 40;// final
		// arg = 30;
		// localVar = 41;
		// 로컬인터페이스
		MyFunctionalInterface5 f1 = () -> {
			System.out.println("arg:" + arg);
			System.out.println("localVar:" + localVar + "\n");
		};
		f1.method();
	}
}
