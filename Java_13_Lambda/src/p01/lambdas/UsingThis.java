package p01.lambdas;
/* *
 * 람다식 블록에는 클래스 멤버인 필드와 메소드 제약없이 사용(접근) 가능
 * 람다식 실행 블록 내에서 this는 람다식을 실행한 객체의 참조
 * */
public class UsingThis {
	public int Field1 = 10;
	class Inner{
		int Field1 = 20;
		void method() {
			MyFunctionalInterface4 fi = ()->{
				System.out.println("outterField:"+Field1);
				///바깥 객체의 참조를 얻기위해 클래스명.this사용
				System.out.println("outterField:"+UsingThis.this.Field1+"\n");
				
			    System.out.println("innerField:"+Field1);
			    //람다식 내부에서 this는 Inner객체를 참조.
				System.out.println("innerField:"+this.Field1+"\n");
			};
			/*= new MyFunctionalInterface4() {
				@Override
				public void method() {
					System.out.println("outterField:"+Field1);
					///바깥 객체의 참조를 얻기위해 클래스명.this사용
					System.out.println("outterField:"+UsingThis.this.Field1+"\n");
				    System.out.println("innerField:"+Field1);
				    //람다식 내부에서 this는 Inner객체를 참조.
					System.out.println("innerField:"+this.Field1+"\n");	
					
				}
			};*/
			fi.method();
		}
	}
}
