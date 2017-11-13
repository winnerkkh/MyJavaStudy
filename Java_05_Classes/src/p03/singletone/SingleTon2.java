package p03.singletone;
/* *
 * 클래스의 경로명 src.p05.singleton.SingleTon2.class
 * */
public class SingleTon2 {
	//필드
	
	private static SingleTon2 instance;
	private SingleTon2() {}
	public static SingleTon2 getInstance() {
		if(instance!=null) instance = new SingleTon2();
		return instance;
	}
}
