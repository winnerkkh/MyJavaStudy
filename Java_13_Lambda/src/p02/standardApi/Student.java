package p02.standardApi;

public class Student {
	// 필드
	private String name;
	private int engScore;
	private int mathScore;

	// 생성자
	public Student(String name, int engScore, int amthScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = amthScore;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getmathScore() {
		return mathScore;
	}

}
