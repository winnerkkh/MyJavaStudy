package p04.set;

public class Member {
	
	//필드
	public String name;
	public int age;
	
	//생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//객체의 논리적 동등비교는 eqauls() 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; //Casting
			return member.name.equals(name)&& (member.age == age); //기본 논리 연산자 비교는 == 를 사용
		}
		
		else
			return false;
	}
	
	@Override //hashCode재정의
	public int hashCode() {
		//String객체는 내용이 동일하면 같은 hashCode()값을 가짐
		//2018699554 + 30
		//1311053135 + 30
		return name.hashCode()+age;//
	}


	
	
	
}
