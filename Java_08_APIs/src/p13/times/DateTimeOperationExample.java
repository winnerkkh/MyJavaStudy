package p13.times;
import java.time.LocalDateTime;
/* *
 * time패키지
 * LocalDateTime 날짜 더하고 빼기
 * 더하기 plus + [년|월|일|시|분|초]
 * 빼기  minus + [년|월|일|시|분|초]
 * */
public class DateTimeOperationExample {
	public static void main(String[] args) {
		//내 pc의 현재 날짜 시간 객체 생성
		LocalDateTime now = LocalDateTime.now();//현재 시간 now()
		System.out.println("현재시: " + now);
		
		//minus(plus) (년,월,일) (숫자)
		LocalDateTime targetDateTime = now.plusYears(1). // 1년 이후
										   minusMonths(2). // 두달전
										   plusDays(3). // 3일후
										   plusHours(4). // 4시간 후
										   minusMinutes(5). //5분전
										   plusSeconds(6); //6초후
		LocalDateTime targetDatTime2 = now.plusYears(1);
		System.out.println("결과: "+targetDateTime);
		targetDatTime2 = now.minusMonths(2);
		targetDatTime2 = now.plusDays(3);
		System.out.println("결과:"+targetDateTime);
		System.out.println("결과2:"+targetDatTime2);
	}

}
