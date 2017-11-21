package p02.standardApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student2> list
				= Arrays.asList(
					new Student2("홍길동","M",90),	
					new Student2("일지매","M",90),	
					new Student2("유관순","F",95),	
					new Student2("김관순","F",92)	
						);
	//
	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum = 0;
		for (Student2 student : list) {
			if (predicate.test(student)) { //test의 결과가 참일때 집계
				count++;
				sum += student.getScore();
			}
		}
		return sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t->t.getGender().equals("M"));
		System.out.println("남학생들의 평균" + maleAvg);


		double femaleAvg = avg(t->t.getGender().equals("F"));
		System.out.println("여학생들의 평균" + femaleAvg);
	}
}
