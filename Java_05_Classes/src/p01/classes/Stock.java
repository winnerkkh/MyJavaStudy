package p01.classes;

public class Stock {

	
		//속성(field)
		private String goodsName;
		private int qty;
		
		
		//생성자(Constructor)
		Stock(String goodsName, int qty){
			this.goodsName = goodsName;
			this.qty = qty;
		}
		

		
		//메소드
		//입고
		public int inStock(int qty) {
			this.qty+=qty;
			return qty;//입고된 수량 리턴
		}
				
		//출고
		public int OutStock(int qty) {
			if(this.qty-qty<0) {
				return 0;
			}
			
			else {
				this.qty -= qty;
				return qty; //출고된 수량 리턴
			}
		}
		
		public int getStock() {
			return qty;// this.qty와 동일 =>현재 수량을 알수있게 하는 메소드
		}
}
