package p02.standardApi;

/* *
 * Function 함수적 인터페이스
 * 	- 매개값과 리턴타입이 모두 있는 추상 메소드
 *  - 주로 매개값을 리턴값으로 매핑(타입변환)할 경우 사용
 * */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionalExample {
	// 리스트 생성
	private static List<Student> list 
					= Arrays.asList(new Student("홍길동", 90, 96), 
									new Student("일지매", 95, 93)
    );

	// printString메소드
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");//
		}
		System.out.println();
	}// 메소드끝.

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");//
		}
		System.out.println();
	}// 메소드끝.

	public static void printDouble(ToDoubleFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsDouble(student) + " ");//
		}
		System.out.println();
	}// 메소드끝.

	   //평균구하는 메소드
	   public static double avg(ToIntFunction<Student> function) {
		   int sum =0;
		   for(Student student:list) {
			   sum+= function.applyAsInt(student);//int로 변환
		   }
		   double avg = (double)sum/list.size();
		   return avg;
	   }

	public static void main(String[] args) {
		System.out.println("String");
		printString(t -> t.getName());

		System.out.println("Integer");
		printInt(t -> t.getEngScore());

		System.out.println("Integer");
		printInt(t -> t.getmathScore());

		System.out.println("Double");
		printDouble(d -> {
			return d.getmathScore();
			});
		
		double engAvg = avg(s ->s.getEngScore());
		System.out.println("영어 평균:"+engAvg);
		
		double mathAvg = avg(s ->s.getmathScore());
		System.out.println("수학 평균:"+mathAvg);
	}
}
