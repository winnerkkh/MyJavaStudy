package p03.systems;
/* *
 * System.getenv();
 * - 등록된 시스템변수와 변수에 해당하는 값을 구할수 있ㄴ음.
 * 
 * */


public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]" + javaHome);
	}
}
