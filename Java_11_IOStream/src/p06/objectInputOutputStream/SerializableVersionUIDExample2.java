package p06.objectInputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Windows\\Temp\\Object3.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("filed1: " + classC.field1);

	}

}
