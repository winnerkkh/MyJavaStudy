package p06.objectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:\\Windows\\Temp\\Object4.dat");
		FileInputStream fis = new FileInputStream("C:\\Windows\\Temp\\Object4.dat");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//파일에 저장할 자식객체 생성
			Child child = new Child();
			child.field1 = "홍길동";//부모필드에서 상속받은 필드
			child.field2 = "일지매";//자식클래스에서 추가된 필드
			oos.writeObject(child);//파일에 객체 저장
			oos.flush();oos.close();fos.close();//자원 해제
			//파일로부터 객체를 읽어들일 스트림 생성
			ObjectInputStream ois = new ObjectInputStream(fis);
			Child v = (Child)ois.readObject();//
			System.out.println("field1:"+v.field1);
			System.out.println("filed2:"+v.field2);
			ois.close();fis.close();//자원해제
			
		} catch (Exception e) {
			
		}
	}
}
