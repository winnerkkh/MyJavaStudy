package p06.objectInputOutputStream;

import java.io.Serializable;

/* *
 * 객체의 직렬화란 -객체의 필드값들이 직렬화 되는것을 말함.
 *              - 객체를 직렬화 하여 파일에 저장.
 * 역직렬화란 - 파일에 저장된 필드값들을 클래스(설계도원본)를
 *            참고해서 새로 객체를 만드는 것.
 * 역직렬화에서 제외되는 필드는
 * - transient로 선언된 필드와 
 *   static으로 선언된 필드 이다.
 * */

/* *
 * 직렬화/역직렬화가 가능한 클래스 - implmements Serializable
 * */
public class ClassA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// 필드
	int field1;// 인스턴스 필드
	ClassB field2 = new ClassB();// 인스턴스필드 객체로 초기화
	static int field3;// static 필드
	transient int field4;// 인스턴스 필드 (transient)로 선언된 필드는 직렬화에서 제외됨.
}

class ClassB implements Serializable {
	int field1; // field2.field1;
}