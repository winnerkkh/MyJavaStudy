package p01.tryCatchFinally;
/* *
 * 상품명 goodsName
 * 상품가격 price
 * */
public class Goods {
	
	//상수 =>상수 변수는 보통 대문자로 선언
	final int LIMIT = 200; //final 변수 = 값; 상수
			
	//필드
	private String goodsName;
	private int price;

	
	//생성자
	public Goods(String goodsName, int price) {
		//super(); //Goods는 Object를 상속받아서 생성
		this.goodsName = goodsName;
		this.price = price;
	}

	//메소드
	
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	//메소드
	void upPrice(int amount) throws Exception {
		if(amount > LIMIT)
			throw new LimitOutException();
		price +=amount;
	}
	
	void downPrice(int amount) throws Exception {
		if(amount < LIMIT)
			throw new LimitOutException();
		price -=amount;
	}
}