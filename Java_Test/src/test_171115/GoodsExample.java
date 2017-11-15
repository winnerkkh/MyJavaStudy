package test_171115;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GoodsExample {

	// 새우깡의 정상 가격은 1000원
	// 새우깡의 가격 다운 행사 기간은 2017-11-15 ~ 2017-11-18
	// 이 기간 동안의 행사 가격은 800원, 기간이 지나 1000원으로 환원
	// Event객체 생성 해서 날짜 비교해서 상품명과 가격 출력
	// 시작 날짜, 종료날짜 입력 및 parse()메소드 사용

	public static void main(String[] args) {
		boolean isContinue = true;
		Scanner scanner = new Scanner(System.in);

		Goods goods = new Goods("새우깡", 1000);
		LocalDate startDate = null;
		LocalDate eventDate = null;

		while (isContinue) {
			try {
				System.out.println("오늘의 날짜를 입력해 주세요! ex)2017-11-15");
				String today = scanner.next();
				startDate = LocalDate.parse(today);
				eventDate = LocalDate.parse("2017-11-18");
				isContinue = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("날짜 입력형식이 잘못 되었습니다.");
			}
		}

		GoodsEvent goodsEvent = new GoodsEvent(goods, startDate, eventDate);
		long remainMonth = ChronoUnit.MONTHS.between(goodsEvent.getStartDate(), goodsEvent.getEndDate());
		long remainDay = ChronoUnit.DAYS.between(goodsEvent.getStartDate(), goodsEvent.getEndDate());
		Period period = Period.between(goodsEvent.getStartDate(), goodsEvent.getEndDate());

		System.out.println();
		System.out.println(goods.getName() + " 프로모션 행사!");
		System.out.println(goods.getName() + " 정상 가격은 " + goods.getPrice() + " 입니다");
		System.out.println("기간은 " + goodsEvent.getStartDate() + " 부터" + goodsEvent.getEndDate() + "까지 입니다!");

		// 개월까지 명시된 개월 및 일수 출력

		if (remainMonth > 0) {
			//3항 연산자를 이용하여 개월수 출력 유무 확인
			System.out.println("행사 종료일은 오늘인 " + goodsEvent.getStartDate() + "일 부터 "
					+ ((remainMonth > 0) ? remainMonth + "개월 " : "") + period.getDays() + "일 남았습니다 ");
			
			System.out.println("행사 종료일은 오늘인 " + goodsEvent.getStartDate() + "일 부터 " + remainDay + "일 남았습니다 ");
		}
		
		//개월수를 제외한 일수만 출력
		else {
			System.out.println("행사 종료일은 오늘인 " + goodsEvent.getStartDate() + "일 부터 " + remainDay + "일 남았습니다 ");
		} 
	}
}
