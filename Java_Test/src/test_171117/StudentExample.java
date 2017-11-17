package test_171117;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1,"홍길동"));
		students.add(new Student(2,"일지매"));
		students.add(new Student(1,"임꺽정"));//번호가 같으면 논리적 동등 객체로 보고
		                                     //저장하지않게 처리
	  Iterator<Student> itor = students.iterator();
	  while(itor.hasNext()) {
		  Student student = itor.next();
		  System.out.println(student.StudentNum+":"+student.name);
	  }
	}

}
