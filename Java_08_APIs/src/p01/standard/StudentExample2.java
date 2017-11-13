package p01.standard;

import java.util.HashMap;
/* *
 * <타입, 타입> : 형 제한자(generic)
 * */
public class StudentExample2 {

	public static void main(String[] args) {
		// 객체
		//HashMap<객체, 객체> => get(객체) -> 객체 리턴
		// int 타입에 Integer타입의 값이 대입.(Auto-unboxing) 
		
		HashMap<Student, Integer> students = new HashMap<>();
		students.put(new Student("홍길동", 1), new Integer(85)); //put(객체,객체)
		students.put(new Student("일지매", 2), 90);//int타입이 Integer타입으로 Promotion(Auto-Boxing)
		students.put(new Student("임꺽정", 3), 80);

		try {
			int score = students.get(new Student("일지매", 2)); // 85
			System.out.println("성적:"+score);
		} catch (NullPointerException e) {
			System.out.println("찾는 학생이 없어요.");
		}
		
	}
	
}
