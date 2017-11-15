package p04.methods;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(new Integer(1), "사과");
		Pair<Integer, String> p2 = new Pair<>(new Integer(1), "사과");

		boolean result1 = Util2.compare(p1, p2);

		if (result1)
			System.out.println("논리적으로 동동한 객체입니다.");
		else
			System.out.println("논리적으로 동등하지 않은 객체입니다.");

		
		
		
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");
		
		boolean result2 = Util2.<String, String>compare(p3, p4);
		
		if (result2)
			System.out.println("논리적으로 동동한 객체입니다.");
		else
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
	}

}
