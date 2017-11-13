package p10.inner;

public class OutterExample {

	public static void main(String[] args) {
		//바깥쪽 객체 생성
		Outter1 outter = new Outter1();
		
		//안쪽 객체 생성
		//바깥쪽타입.안쪽타입 변수 = 바깥쪽참조변수.new 안쪽 생성자();
		Outter1.Nested nested = outter.new Nested();
		nested.print();
	}

}
