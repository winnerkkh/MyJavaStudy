package test_171115;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class GoodsExample {
	

	//새우깡의 정상 가격은 1000원
	//새우깡의 가격 다운 행사 기간은 2017-11-15 ~ 2017-11-18
	//이 기간 동안의 행사 가격은 800원, 기간이 지나 1000원으로 환원
	//Event객체 생성 해서 날짜 비교해서 상품명과 가격 출력
	//시작 날짜, 종료날짜 입력 및 parse()메소드 사용
	
	
	public static void main(String[] args) {
	boolean isContinue = true;
	Scanner scanner = new Scanner(System.in);
		
		
		
		
	Goods goods = new Goods("새우깡", 1000);
	
	

	System.out.println("오늘의 날짜를 입력해 주세요! ex)2017-11-15");	
	String today = scanner.next();
	LocalDate startDate = LocalDate.parse(today);
	LocalDate eventDate = LocalDate.parse("2017-11-18");
	
	
	
	GoodsEvent goodsEvent = new GoodsEvent(goods, startDate, eventDate);
	Period period = Period.between( goodsEvent.getStartDate(), goodsEvent.getEndDate()); 
	
	System.out.println(goods.getName()+" 프로모션 행사!");
	System.out.println(goods.getName()+" 정상 가격은 " + goods.getPrice()+ " 입니다");
	System.out.println("기간은 " + goodsEvent.getStartDate() + " 부터" + goodsEvent.getEndDate() + "까지 입니다!");
	System.out.println("행사 종료일은 오늘인 " + goodsEvent.getStartDate()+"일 부터 " + period.getDays() + "일 남았습니다 ");
	}
}
