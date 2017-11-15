package p13.times;

import java.time.LocalDate;
import java.time.LocalDateTime;

/* *
 * time패키지(자바8추가)
 * LocalDate, LocalDateTime
 * */



public class DateTimeInfoExample {
	public static void main(String[] args) {
		//날짜 시간 객체 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear()+"년 ";
		strDateTime += now.getMonthValue()+"월 ";
		strDateTime += now.getDayOfMonth()+"일 ";
		strDateTime += now.getDayOfWeek()+" ";
		strDateTime += now.getHour()+"시 ";
		strDateTime += now.getMinute()+"분 ";
		strDateTime += now.getSecond()+"초 ";
		strDateTime += now.getNano()+"나노초 ";
		System.out.println(strDateTime);
		
		
		// 윤년 여부확인 메소드 isLeapYear();
		// LocalDateTime -> LocalDate 변경 하는 메소드 toLocalDate()
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("유년: 2월 29일 까지 있습니다.");
		}
		else
			System.out.println("평년: 2월 28일 까지 있습니다");
	}
}
