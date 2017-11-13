package p10.inner;

public class Outter {
	// 메소드 안에 선언된 내부클래스의 메소드
	// 값으로 사용되는 변수는 final(즉,상수)
	// method1()의 매개변수도 내부클래스에서 사용되기 때문에
	// final이 되었음.
	// 매개변수안에 (final int 변수) - 7까지 의 표기법
	public void method1(final int arg) {// 메소드의 매개변수가 final
		final int localVar = 1;// 로컬변수 final
		// arg = 100;//상수 이므로 값 변경 불가
		// localVar =100;//상수
		// 로컬 클래스
		class Inner {
			public void method() {
				// 메소드내에 선언된
				// 로컬 클래스의 메소드에서 사용되는
				// 변수들은 모두 final(즉,상수만 올수있음)
				int result = arg + localVar;
			}
		}
	}

	// 자바 8 이후
	// 메소드의 매개변수나 메소드내의 선언된 로컬변수가
	// 내부클래스에서 사용되려면 상수여야하므로
	// 매개변수와 로컬변수는 상수로 사용.
	// 자바7까지는 엄격한 문법을 적용했지만.
	// 자바8에서는 final을 제거함.
	// final의 성격은 그대로 유지됨.
	public void method2(/* final */int arg) {
		// final(상수)
		/* final */ int localVar = 1;// final (즉,상수)
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
}
