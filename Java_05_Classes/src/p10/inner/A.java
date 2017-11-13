package p10.inner;
/* *
 * 중첩 클래스
 * */

public class A { //바깥쪽 클래스
	//생성자
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	//멤버클래스
	//인스턴스 멤버 클래스
	//인스턴스 멤버클래스에는 인스턴스 필드와 메소드만 올수 있고,
	//static 필드와 메소드는 올수 없음.
	public class B{
	//생성자
		B(){
			System.out.println("B 객페가 생성됨");
		}
		
	//필드
		int field1; //인스턴스 필드
		//static int field2; //오류 - 인스턴스 멤버클래스에서는 static멤버필드가 올수 없음.
		
	//메소드
		void method1() {}//인스턴스 메소드
		//static void method2() {}//오류-인스턴스멤버클래스에 static멤버가 올수 없음 
		
		
	}
	
	//정적 멤버 클래스
	//static 클래스에는 인스턴스 필드, 메소드, static 필드, 메소드
	//모두 올수 있음
	static class C{
		//생성자
		C(){
			System.out.println("C 객체가 생성됨");
		}
		
		//필드
		int field1; //인스턴스 멤버필드
		static int field2; //정적 멤버필드
		
		//메소드
		void method1() {}; //인스턴스 멤버메소드
		static void method2() {} // 정적 멤버 메소드
	}
	
	//클래스 A의 메소드
	void method1() {
		//로컬 클래스
		class D{/* 외부에서는 로컬 클래스 D에 접근 할수 없음*/
			
			//생성자
			D(){
				System.out.println("D객체가 생성됨.");
			}
			
			//필드
			int field1; //인스턴스 필드
			//static int field2; //오류발생 - static필드는 올수 없음
			
			//메소드
			void method() {} //인스턴스 메소드
			//static void method2() {} //오류 - static메소드는 올 수 없음
		}//클래스 D끝.
		
	    //객체 생성
		D d = new D(); // 1, 객체 생성
		d.field1 = 3; //  2, 로컬클래스의 멤버필드 초기화
		d.method(); //    3, 로컬 메소드를 메소드의 멤버화
		
		
		
	} // method1 끝
	
}//바깥 클래스 끝.
