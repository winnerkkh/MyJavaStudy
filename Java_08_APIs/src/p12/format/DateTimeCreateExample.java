package p12.format;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
	/*
	 * * time패키지의 API들(자바8에서 추가)
	 */

	public static void main(String[] args) {
		// 날짜 얻기
		LocalDate currDate = LocalDate.now(); // 현재의 날짜 얻기 now()
		System.out.println("현재 날짜: " + currDate);

		// 날짜 강제 세팅하여 객체 생성 of(년,월,일) =>특정 년월일의 날짜 객체 생성
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜 " + targetDate + "\n");

		// 시간얻기(LocalTime)
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시각: " + currentTime);

		// 시간 세팅하여 객채생성 of(시,분,초,밀리초)
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시각: " + targetTime);

		// 날짜와 시간 얻기(LocalDateTime)
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 시각: " + currentDateTime);

		// 날짜 시간 세팅하여 객체 생성 of(년, 월, 일, 시, 분, 초, 밀리초)
		LocalDateTime targetDateTime = LocalDateTime.of(2014, 5, 10, 6, 30, 0);
		System.out.println("목표 날짜 시각: " + targetDateTime);

		// 협정시, 시간존(TimeZone)
		// 타임존 설정 ZoneID.of(zone 아이디);
		// ZonedDateTime.now(타임존) <==설정된 타이;ㅁ존으로 날짜 시간 객체 생성
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);

		// 뉴욕타임존 날짜 시간
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존:" + newYorkDateTime);
		
		// 특정 시점의 타임스템프 얻기
		// 작업 경과, 시간차, 특정 업무 중의 시간 표시를 위한 용도로 사용
		//시간의 비교 isBefore(), isAfter(),
		//경과 시간 얻는 메소드 until()
		Instant instant1 = Instant.now();// 현재 시점의 time-stamp
		Instant instant2 = null;// 로컬변수의 초기화 null
		try {
			Thread.sleep(10);// 10밀리초 정지
			instant2 = Instant.now();// instant1 시점 이후의 time-stamp
			if (instant1.isBefore(instant2)) {//
				System.out.println("instant1이 instant2보다 빠릅니다");
			} else if (instant1.isAfter(instant2)) {
				System.out.println("instant1이 instant2보다 늦습니다");
			} else {
				System.out.println("동일한 시간입니다.");
			}
		} catch (InterruptedException e) {
		}

		System.out.println("차이(nanos):" + instant1.until(instant2, ChronoUnit.NANOS));

	}
}
