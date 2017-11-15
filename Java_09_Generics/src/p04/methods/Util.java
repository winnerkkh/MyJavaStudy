package p04.methods;
import p02.generics.Box;

/* *
 * generic 메소드
 *	  	<T> 리턴타입<T> 메소드명(){
 *	  	}
 * 
 * */
public class Util { //일반 클래스
	//제네릭 메소드
	public static <T> Box<T> boxing(T t){
		Box <T> box = new Box<>();
		box.set(t);
		return box;
	}
	
	

}
