package p13.times;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		// 객체
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 " + now);
		
		
		//상대적이 아닌 절대적 값을 적용하여 변경하는 메소
		//with+(년,월,일,요일,시간,분,초)
		LocalDateTime targetDateTime = null;
		targetDateTime = now.withYear(2024). //2024년
							 withMonth(10). //10월
							 withDayOfMonth(5). //5일
							 withHour(13); //13시
		
		System.out.println("목표 시간: "+targetDateTime);
		System.out.println("=======================================================");
		
		
		//년도의 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("올해의 첫 일 :"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막 일 :"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫 일 :"+targetDateTime );
		System.out.println("=======================================================");
		
		//월 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("이달의 첫 일 :"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이달의 마지막 일 :"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음달의 첫 일 :"+targetDateTime );
		System.out.println("=======================================================");

		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이달의 첫 월요일:"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일:"+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일:"+targetDateTime);
	}
}
