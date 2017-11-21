package p01.annotation;
/* annotation 적용하기
 * - RUNTIME시 특정기능 자동 실행
 * */
public class Service {
	//어노테이션에 매개값이 없으면 default인 "-"가 15회 출력
	@PrintAnnotation
	public void method() {
		System.out.println("실행 내용");
	}
	
	//어노테이션에 매개값이 하나 표시되어 있으면 해당 값으로 바뀐값으로("*")로 15회 출력된다
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행내용");
	}
	
	// value ="#" 바뀌고, 20출력
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용");
	}
}