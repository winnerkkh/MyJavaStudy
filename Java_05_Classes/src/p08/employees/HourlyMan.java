package p08.employees;

public class HourlyMan extends Employee{

	
	//필드	
	private int hour, perHour; // 근무시간, 시급 필드, 초기값0
	
	//생성자
	public HourlyMan(String name) {
		super(name);
	}
	
	//생성자
	//Shift + Alt + S
	public HourlyMan(String name, int hour, int perHour) {
		super(name);
		this.hour = hour;
		this.perHour = perHour;
	}

	@Override
	public int computePay() {
		return hour*perHour; //근무시간 *시급
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getPerHour() {
		return perHour;
	}

	public void setPerHour(int perHour) {
		this.perHour = perHour;
	}
	
	
}
