package p01.tryCatchFinally;
/* *
 * private String타입의 상품명
 * private String타입의 제조사명
 * private int 타입의 qty
 * */
public class Stock {

	//필드
	
	private String goodsName;
	private String company;
	private int qty;

	
	
	//생성자
	
	public Stock(String goodsName) {	
		this.goodsName = goodsName;
	}

	public Stock(String goodsName, String company) {

		this.goodsName = goodsName;
		this.company=company;
	}

	
	public Stock(String goodsName, String company, int qty) {
	
		this.goodsName = goodsName;
		this.company = company;
		this.qty = qty;
	}
		
	//메소드
	public String getgoodsName() {
		return goodsName;
	}

	public void setgoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
	
	public int getQty() {
		return qty;
	}
	public void setqty(int qty) {
		this.qty = qty;
	}
	
	
	//입고 처리 메소드
	void inStock(int qty) { //원하는 수량을 메소드에 넘겨주는 역할 -매개변수
		this.qty += qty; //기존필드에 매개변수로 넘어온 값을 누적
	}
	
	//출고 처리 메소드
	//메소드 앞에 타입(int, bye, long, boolean, 객체)이 있으면 실행부{}안에 return문이 있어야함
	int outStock(int qty) throws Exception { //원하는 수량을 메소드에 넘기는 역할 - 매개변수
		if(this.qty<qty) //처리
			throw new OutOfStock("재고량이 모자랍니다. 현재고:"+this.qty);
		  //throw new Exception("재고량이 모자랍니다. 현재고는 "+this.qty + " 입니다");
		this.qty -= qty; //필드의 역할(현재상태저장): 현재고수량에서 원하는양(qty)를 빼줌
		return qty;
	}
	
}
