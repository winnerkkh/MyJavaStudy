package p02.clone;

import java.util.Objects;

/* *
 * Comparable인터페이스를 구현하지않은 일반 클래스의 비교
 *  - Comparator 인터페이스를 구현한
 *    클래스를 하나 만들어서 두 객체를 비교할수 있는 메소드로 비교하고
 *    Objects클래스의 compare매소드의 매개변수로 
 *    comparator구현체를 넘김
 * */

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("결과" + result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println("결과" + result);

	}

}
