package p03.singletone;
/* *
 * SigleTone 방식
 *   - 객체의 생성을 막고 하나의 instance만 생성하여
 *     필요시 사용하고 되돌려주는 방식의 클래스 생성 운영 방식
 * */
public class SingleTon {
	//필드
	private static SingleTon instance = new SingleTon();
	private SingleTon() {} //생성자는 private으로 접근제한이 되어 있어서 외부에서 객체를 생성 불가능.
	
	static SingleTon getInstance() {
		return instance;
	}
}
