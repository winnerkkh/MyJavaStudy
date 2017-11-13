package p08.employees;

public class SalaryMan extends Employee {
	
	//필드
	private int annualSalary; //초기값은 0
	
	
	//생성자
	public SalaryMan(String name) {
		super(name); //매개변수 1개짜리 부모생성자 호출
	}
	
	//생성자
	public SalaryMan(String name, int annualSalary) {
		this(name); //자신의 클래스내의 매개변수 1개짜리 생성자 호출
		//super(name); //매개변수 1개짜리 부모생성자 호출
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public int computePay() {
		return annualSalary/13; //int 타입의 값을 리턴하므로 해당 타입의 초기값으로 보여짐
	}
	
	//부모클래스에서 final로 선언된 메소드는 자식클래스에서 수정불가
	//private int computeIncentive() {}
	

}
