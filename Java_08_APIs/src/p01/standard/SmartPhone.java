package p01.standard;

public class SmartPhone {

	// 필드
	private String company;
	private String Os;

	// 생성자
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		Os = os;
	}

	@Override
	public String toString() {
		return company + ":"+Os;
	}

}
