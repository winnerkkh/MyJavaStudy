package p03.singletone;

public class Singletone1Example {
	public static void main(String[] args) {
		//SingleTon obj1 = new SingleTon();
		
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		
		if(obj2==obj3) {
			System.out.println("같은 Singletone 객체 입니다");
		}
		
		else {
			System.out.println("같은 Singletone 객체 입니다");
		}
	}
}
