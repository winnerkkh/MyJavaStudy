package p01.tryCatchFinally;

public class StockExample {
	public static void main(String[] args) throws Exception {
		//객체생성
		Stock stock = new Stock("새우깡", "농심", 50);
		System.out.println(stock.getgoodsName()+"의 현 재고는=" +stock.getQty());
		
		
		//입고처리
		stock.inStock(20); //inStock()메소드 호출
		//입고처리 후의 현재고 값
		System.out.println(stock.getQty());
		
		try {
			stock.outStock(90);
			System.out.println(stock.getQty());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("조금만 빼가 주세요");
		}
	}
}