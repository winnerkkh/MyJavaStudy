package p02.clone;

public class MemberCloneExample {
	public static void main(String[] args) {
		// 원본객체 생성
		Member origin = new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));
		
		// 복제
		Member cloned = origin.getMember();// 얕은 복제에서 깊은복제
		
		// 깊은복제
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		// 값 비교
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name:" + cloned.name);
		System.out.println("age:" + cloned.age);
		System.out.print("scores:{");
		
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);

		System.out.println("[원본 객체의 필드값]");
		System.out.println("name:" + origin.name);
		System.out.println("age:" + origin.age);
		System.out.print("scores:{");
		
		for (int i = 0; i < origin.scores.length; i++) {
			System.out.print(origin.scores[i]);
			System.out.print((i == (origin.scores.length - 1)) ? "" : ",");
		}
		
		System.out.println("}");
		System.out.println("car: " + origin.car.model);
	}
}
