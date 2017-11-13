package p01.References;
/* *
 * 
 * */

public class Arr03Example {
	public static void main(String[] args) {
		String[] str = {"산토끼", "집토끼", "판토끼", "죽은토끼", "알카리토끼"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]+",");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		//향상된 for문으로 바꿔보세요
		// 타입 변수: 객체변수명
		for(String s:str) { //변수 s선언
			System.out.println(s + ",");
			
		}
		
	}
}