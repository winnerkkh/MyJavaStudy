package p01.classes;

public class StockExample01 {
	public static void main(String[] args) {
		Stock stock = null;
		stock = new Stock("새우깡", 10);
		int inQty = stock.inStock(10); //현재고는 20개
		//리턴타입있는 메소드는 호출하면 결과값을 호출한 쪽으로 되돌려줍니다.
		//리턴값을 호출한 쪽에 받아서 처리해도되고 안받아도됨.

		stock.inStock(20); //현재고는 30개
		System.out.println(stock.getStock());
		stock.OutStock(10); //현재고는 20개
		System.out.println(stock.getStock());
		stock.OutStock(20); //현재고는 10개
		System.out.println(stock.getStock());
	}
}
