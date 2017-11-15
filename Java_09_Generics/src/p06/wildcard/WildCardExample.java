package p06.wildcard;

import java.util.Arrays;

/* *
 * 와일드 카드(?)
 * */
public class WildCardExample {

	// 모두 대입 가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() +" 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//Student와 HighStudent만 가능
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() +" 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	//Worker와 Person만 가능
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() +" 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반과정", 5);
		personCourse.add(new Person("일발인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		
		//출력 매소드의 배개변수로(<?>)
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		
		//매소드의 배개변수로(<? extends Student>)
	//	registerCourseStudent(personCourse);
	//	registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		
		//메소드의 매개변수로 (<? super Worker>)
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	//  registerCourseWorker(studentCourse);
	//	registerCourseWorker(highStudentCourse);
	}

}
