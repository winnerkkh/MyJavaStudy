package p13.times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		//parse()문자열의 내용을 읽어서 원하는 형태로 변환
		localDate=LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		
		//입력한 문자열 "2024-05-21"이 위에서 만든 형식 ISO_LOCAL_DATE 맞는지 확인 
		localDate= LocalDate.parse("2024-05-21",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate= LocalDate.parse("2024/05/21",formatter);
		System.out.println(localDate);

		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate= LocalDate.parse("2024.05.21",formatter);
		System.out.println(localDate);
		
	}
}
