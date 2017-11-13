package p01.standard;
import java.util.HashMap;

/* *
 *	HashMap<키, 값> 키와 값의 형태로 자료를 저장할수 있는 객체
 *	HashMap에 객체를 저장하는 메소드  put(키,값); -키(객체),값(객체)
 *			  저장된 객체를 가져오는 메소드 get(키); 키에 대응되는 값(객체)를 가져올수 있음 
 * */

public class KeyExample {

	public static void main(String[] args) {
		// 자료저장용 객체 생성
		HashMap<Key, String> hashMap = new HashMap<>();
		//
		
		hashMap.put(new Key(2), "홍길동");
		
		String value = hashMap.get(new Key(2));
		System.out.println(value);
	}

}
