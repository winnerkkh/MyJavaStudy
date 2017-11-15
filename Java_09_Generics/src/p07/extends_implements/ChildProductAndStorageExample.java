package p07.extends_implements;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		
		// 객체 생성
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("samsong");

		//인터페이스<Tv> = new구현체 객체 생성
		Storage<Tv> storage = new StorageImplement<>(100);
		storage.add(new Tv(), 0); //저장
		Tv tv = storage.get(0);//출력
	}
}
