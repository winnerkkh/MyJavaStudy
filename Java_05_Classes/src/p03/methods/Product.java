package p03.methods;

public class Product {
	//필드
	//static필드는 주로 공용으로 사용되는 경우 선언
	static int count=0;//static필드(정적필드)
	long serialNo;//인스턴스필드
	//초기화 블럭
	{
	  ++count;//count를 1증가 후
	  serialNo = count;//인스턴스 변수인 serialNo에 대입
	}
	//생성자
	Product(){}
	//메소드
	void print() {
		System.out.println("count="+count);
	}
}