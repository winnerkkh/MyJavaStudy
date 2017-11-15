package p06.wildcard;

public class Course<T> {
	//필드
	private String name; //강좌명
	private Object[] students; //수강생
	
	//생성자
	public Course(String name, int capacity) { //수용인원
		this.name = name;
		students = (T[])(new Object[capacity]); //수강색 저장 배열 생성	
	}
	
	//메소드
	public String getName() {return name;}
	public Object[] getStudents() {return students;}
	
	//수강생 등록작업
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) { //배열 중 비었는 요소에
				students[i]=t; //객체 저장 후
				break; //빠져나옴
			}
		}
	}
}
