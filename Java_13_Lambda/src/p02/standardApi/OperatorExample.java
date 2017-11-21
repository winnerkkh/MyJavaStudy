package p02.standardApi;
/* *
 * Operator 함수적 인터페이스는
 * - 동일한 타입의 데이타 연산을 하는 추상 메소드
 * */
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92,95,87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int scores: scores) {
			result = operator.applyAsInt(result, scores);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
				(a,b)->a>=b?a:b
				);
		System.out.println("큰값:"+max);
		
		int min = maxOrMin(
				(a,b)->a>=b?a:b
				);
		System.out.println("작은값:"+min);
	}
}
