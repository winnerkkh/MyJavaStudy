package test_171115;

import java.time.LocalDate;

public class GoodsEvent {
	Goods goods;
	LocalDate startDate;
	LocalDate endDate;

	//생성자
	
	
	public GoodsEvent(Goods goods, LocalDate startDate, LocalDate endDate) {
		super();
		this.goods = goods;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	//메소드
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
