package p01.tryCatchFinally;

public class OutOfStock extends Exception{

	//필드
	String message;
	//생성자
	OutOfStock(String message){
		this.message = message;
	}
	//메소드
	@Override
	public String getMessage() { return message; }
}