package p06.objectInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) {
		File f = new File("C:\\Windows\\Temp\\Object2.dat");
		FileOutputStream fos;
		ObjectOutputStream oos;

		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			// 파일에 저장할 객체 생성
			ClassA classA = new ClassA();//
			classA.field1 = 1;
			classA.field2.field1 = 2;
			classA.field3 = 3; // static - 직렬화에서 제외!!!
			classA.field4 = 4; // ** 직렬화에서 제외!!!

			oos.writeObject(classA);// 객체 저장
			oos.flush(); // 밀어내기
			oos.close();
			fos.close(); // 자원해제

			System.out.println("----------------------");
		    fis = new FileInputStream(f);
		    ois = new ObjectInputStream(fis);
		    ClassA v = (ClassA)ois.readObject();//객체 읽어들이기 ,new ClassA();
		    System.out.println("field1:"+v.field1);
		    System.out.println("field2:"+v.field2.field1);
		    System.out.println("field3:"+v.field3);
		    System.out.println("field4:"+v.field4);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
