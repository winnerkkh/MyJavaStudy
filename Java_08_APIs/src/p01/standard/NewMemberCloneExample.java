package p01.standard;

/* *
 * clone()메소드 객체의 복제 기능
 * 복제가능한 객체는 Cloneable 인터페이스를 구현해야함.
 * */

public class NewMemberCloneExample {
	public static void main(String[] args) {
	//원본 객체 생성
	  NewMember origin 
		 = new NewMember("hong", "홍길동", "1234", 25, true);
	  NewMember cloned = origin.getMember();
	  
	  cloned.password="5678";
	  
	  System.out.println("[원본객체 정보]");
	  System.out.println(origin.getClass().getSimpleName() + "의 id: " +origin.id );
	  System.out.println(origin.getClass().getSimpleName() + "의 name: " +origin.name );
	  System.out.println(origin.getClass().getSimpleName() + "의 password: " +origin.password );
	  System.out.println(origin.getClass().getSimpleName() + "의 age: " +origin.age );
	  System.out.println(origin.getClass().getSimpleName() + "의 adult: " +origin.adult );
	  
	  System.out.println();
	  
	  System.out.println("[사본객체 정보]");
	  System.out.println(cloned.getClass().getSimpleName() + "의 id: " +cloned.id );
	  System.out.println(cloned.getClass().getSimpleName() + "의 name: " +cloned.name );
	  System.out.println(cloned.getClass().getSimpleName() + "의 password: " +cloned.password );
	  System.out.println(cloned.getClass().getSimpleName() + "의 age: " +cloned.age );
	  System.out.println(cloned.getClass().getSimpleName() + "의 adult: " +cloned.adult );
	  
	}

}
