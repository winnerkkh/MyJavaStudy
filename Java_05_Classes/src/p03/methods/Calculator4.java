package p03.methods;

/* *
 * 정적 메소드
 *  - 클래스가 클래스로더에 으ㅟ해 메모리에 적재될때
 *    클래스내용을 파악하여 static키워드가 있는 필드나 메소드는
 *    따로 떼어서 static(정적)영역으로 로드함.
 *  - 인스턴스 필드, 메소드는 클래스내에 그대로 둠.
 *  => static멤버 클래스.멤버로 호출
 *  => instance멤버는 객체를 생성 후 접근 가능
 * */


public class Calculator4 {
	String color; //인스턴스 필드
	
	void setColor(String color) { //인스턴스 메소드
		this.color = color;
	}
	
	//정적 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	//정적 메소드
	static int minus(int x, int y) {
		return x-y;
	}
	
}
