package p01.annotation;

import java.lang.reflect.Method;

/* *
 * annotation의 적용 
 * */
public class PrintAnnotationExample {
	public static void main(String[] args) {

		//Serviece클래스로부터 메소드 정보 얻기
		Method[] declaredMethods = Service.class.getDeclaredMethods(); // Service클래스의 메소드 3개
		//
		for(Method method: declaredMethods) {
			//Annotation적용 여부 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 정보 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.print("["+method.getName()+"]");
				
				//r구분선 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				try {
					//메소드 호출
					method.invoke(new Service()); //인스턴스매소드 호출(invoke()
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
