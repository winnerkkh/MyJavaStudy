package p01.lambdas;

public class MyFunctionalInterface3Example {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi3;

		fi3 = new MyFunctionalInterface3() {
			@Override
			public int method(int x, int y) {// 두개의 매개값
				int result = x + y;
				return result;// 리턴문
			}
		};
		System.out.println(fi3.method(2, 5));// 메소드 호출
		
		// 람다식
		fi3 = (x, y) -> {
			return x + y;
		};// return문 1개
		
		fi3 = (x, y) -> x + y;
		int result = fi3.method(2, 5);
		System.out.println("result=" + result);

		// 메소드내에서 다른메소드의 호출
		fi3 = new MyFunctionalInterface3() {
			@Override
			public int method(int x, int y) {
				int result = sum(x, y);// 다른 메소드 호출
				return result;
			}
		};

		fi3 = (x, y) -> {
			return sum(x, y); // 다른 메소드 호출한 결과 리턴
		};

		fi3 = (x, y) -> sum(x, y);// 다른메소드를 호출하는 람다식
		System.out.println(fi3.method(2, 5));

	}

	// 두개의 값을 더하여 결과를 리턴하는 메소드
	public static int sum(int x, int y) {
		return (x + y);
	}

}
