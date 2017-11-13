package p01.classes;

public class Student {
	
		//속성
		//이름(String), 번호(int)
		
		String name;
		int no;
		
		
		Student(){}
		Student(String name, int no){
			this.name = name;
			this.no= no;
		}
		
		
		
		void namePrinting() {
			System.out.println("학생의 이름은 " + name + "입니다");
		}
		
		void numberPrinting() {
			System.out.println("학생 번호는 " + no + "입니다");
		}
		
		
}
