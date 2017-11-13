package p08.employees;

/* *
 * 급여계산용 프로그램
 * @author Administrator
 * */

public abstract class Employee extends Object {

	// 필드
	private final float RATE = 0.1f;// 상수
	private String name;
	int pay, bonus;

	// 생성자
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 급여계산 메소드
	public abstract int computePay();// 반드시 구현되어야함.

	// 메소드에 final을 사용하면 자식클래스에서 수정 불가
	public final int computeIncentive() {
		pay = computePay();
		if (pay > 20000) {
			bonus = (int) (pay * RATE);// 잔전처리
		}
		return bonus;
	}
	public void print() {
		System.out.println(name + "의 급여: "+pay+", 보너스: "+bonus);
	}
}
