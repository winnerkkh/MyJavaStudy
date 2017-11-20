package p06.objectInputOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* *
 * 일반클래스를 상속받은 후 Serializable구현한 클래스
 * 	필드 추가
 * */

public class Child extends Parent implements Serializable {
	// public String field1; //내부적으로 보이진 않지만 존재함.
	public String field2; // 직렬화 가능
	
	/* *
	 * writeObject()메소드는 객체 저장 직전에 자동(auto)호출되는 메소드
	 * - 이 메소드를 재정의 해서 부모필드값을 저장
	 * */
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1);// String타입의 부모클래스의 field1의 값 저장
		out.defaultWriteObject();// 자식의 필드값 저장

	}
	
	
    /* *
	* readObject()메소드는 객체 생성 직전에 자동 호출되는 매소드
	* - 이 메소드를 재정의해서 부모필드값을 대입
	* */
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF(); //저장된 String타입의 부모필드 field1의 값 읽어들여서 대입.
		in.defaultReadObject();//자식필드값 읽어들여서 대입
	}

}
