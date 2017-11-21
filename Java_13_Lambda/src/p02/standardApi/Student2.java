package p02.standardApi;

public class Student2 {
	//필드
	private String name;
	private String gender;
	private int score;
	//생성자
	public Student2(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	//메소드
	public String getGender() {	return gender;	}
	public int getScore() {	return score;}
	
	
}
