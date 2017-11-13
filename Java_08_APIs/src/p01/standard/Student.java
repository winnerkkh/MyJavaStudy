package p01.standard;

public class Student {

	//필드
	String name;
	int studentNumber;
	
	//생성자
	public Student(String name, int studentNumber) {

		this.name = name;
		this.studentNumber = studentNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //동일 타입
			if((name.equals(((Student)obj).name))&& (studentNumber ==((Student)obj).studentNumber)) { //동일 내용
				return true; //동일 인물
			}
		}
		return false; //다른 인물
	}
	

	@Override
	public int hashCode() {
		return name.hashCode() + studentNumber;
	}
}
