package test_171113;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			// Class clazz = Class.forName("p05.newinstance.SendAction");
			Class clazz = Class.forName("p05.newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();// new SendAction();
			action.execute();// execute()재정의 됬으므로 재정의된 메소드가 실행
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
