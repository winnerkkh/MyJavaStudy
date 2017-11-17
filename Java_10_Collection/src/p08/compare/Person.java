package p08.compare;

public class Person implements Comparable<Person> {
	// 필드 - 객체의 고유 속성, 현재의 상태를 저장하는 역할
	public String name;
	public int age;

	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return 1; // 양수
		}

	}

}
