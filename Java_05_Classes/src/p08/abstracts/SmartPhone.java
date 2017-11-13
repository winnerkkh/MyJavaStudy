package p08.abstracts;

public class SmartPhone extends Phone {
	// 추상클래스도 클래스이므로
	// 반드시 생성자가 있어야함.
	// 기본 생성자가 없으면 컴파일시 추가됨.
	// 생성된 자식의 생성자에서 부모 생성자
	// 호출은 super()메소드를 이용하여 호출.

	public SmartPhone(String owner) {
		super(owner); // super()메소드는 반드시 첫 줄에 기술하여야함.
	}

	// 메소드
	// 클래스의 상속 처럼
	// 자식클래스에서 필요한 메소드 추가 가능
	// Phone p = new SmartPhon();//프로모션
	// internetSearch() 사용 불가

	public void internetSearch() {
		System.out.println("인터넷 서핑...");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
		// super.turnOff();//부모메소드 호출
	}

}