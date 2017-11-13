package p01.classes;
/* *
 * - 은닉화(encapsulation)
 * 개체의 속성을 보호하기 위해
 * - 속성을 private접근 제어자로 처리하고,
 * - 속성을 접근하는 메소드를 만들어서,
 * - 외부에서 사용할때 속성의 접근을 반드시 메소드()를 통해서
 * - 접근할수 있도록 하는 방식
 * */
public class PersonExample02 {
	public static void main(String[] args) {
	   Person2 person2 = new Person2();
	   person2.setName("홍길동");
	   person2.setAge(20);
	   
	   System.out.println(person2.getName()
			             +"의 나이는 "+person2.getAge()+"입니다.");

	   person2.setName("임꺽정");
	   person2.setAge(-13);//처리하지않고 다음으로 진행
	   System.out.println(person2.getName()
	             +"의 나이는 "+person2.getAge()+"입니다.");  //홍길동의 나이를 그대로 가져옮.
	}
}
