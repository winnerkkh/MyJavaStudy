package p02.enums;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
	  //열거객체 생성
		Week today = null; //today는 열거타입의 참조변수
		
		//Calendar는 내 PC의 시스템타임을 참조하여 현재 시점의 날짜를 리턴하는 객체
		Calendar cal = Calendar.getInstance();//캘린더객체를 얻어옴
		int week = cal.get(Calendar.DAY_OF_WEEK);//Calendar객체로부터 지금 요일을 얻어옴.
		
		
		//Calemdar객체에서
		//요일의 순서는 1일 일요일, 2가 월요일, 3이 수요일...., 7이 토요일 순.
		
		System.out.println("week의 번호:"+week);
		String str = "";
		switch(week) {
		case 1: today=Week.SUNDAY;
				str="일요일";
				break;
		case 2: today=Week.MONDAY;
				str="월요일";
				break;
		case 3: today=Week.TUESDAY; 
				str="화요일";
				break;
		case 4: today=Week.WEDNESDAY; 
				str="수요일";
				break;
		case 5: today=Week.THURSDAY;
				str="목요일";
				break;
		case 6: today=Week.FRIDAY; 
				str="금요일";
				break;
		case 7: today=Week.SATURDAY;
				str="토요일";
				break;
		}
		
		System.out.println("오늘의 요일은:"+today);
		System.out.println("오늘의 요일은:"+str);
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 쉽니다..!");
		}
		
		else {
			System.out.println("열심히 공부를 합니다..!");
		}
			
		
		
		
		
		
	}
}
