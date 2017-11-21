package p01.lambdas;

/* *
 * 람다식 작성법
 * 1. 매개타입은 런타임시에 대입값에 따라 자동 인식 -> 생략가능
 * 2. 하나의 매개변수만 있을 경우 () 생략가능
 * 3. 하나의 실행문만 있을때는 {} 생략 가능
 * 4. 매개변수가 없으면 ()반드시 표시
 * 5. 리턴값이 있는 경우, return 표시
 * 6. {return 문; } => return 으로 {}생략 가능
 * */
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		// 익명구현체 생성(이 자체가 implements) - $1.class
		fi = new MyFunctionalInterface() {
			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
			}
		};
		fi.method(); // 익명구현체의 메소드 호출

		// 람다식 표현
		// 람다식은 메소드명은 없고, 매개변수의 갯수가 중요
		fi = () -> {
			String str = "method call1";// 명령문1
			System.out.println(str); // 명령문2
		};// 매개변수없는 람다식
		fi.method();// 람다식 메소드 호출

		//{}안에 명령문이 하나면 {}생략가능
		fi = () -> {
			System.out.println("method call1");// 명령문1
		};
		fi.method();

		fi = () -> System.out.println("method call1");
		fi.method();
	}
}
