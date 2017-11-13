package p01.tryCatchFinally;

public class GoodsExample {
	public static void main(String[] args) {

		try {
			// 객체 생성
			Goods goods = new Goods("새우깡", 1000);
			System.out.println(goods.getGoodsName() + "의 " + "현재 가격은 " + goods.getPrice() + "입니다.");
			
			goods.upPrice(200);
			System.out.println(goods.getGoodsName() + "의 " + "현재 가격은 " + goods.getPrice() + "입니다.");
			goods.upPrice(300);// LIMIT보다 큰 가격- 예외
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}