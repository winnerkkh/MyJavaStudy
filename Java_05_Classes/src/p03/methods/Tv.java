package p03.methods;
/* *
 * 초기화 블럭{}
 * 	- 인스턴스 필드의 초기화{}
 *  - 정적(static)필드의 초기화 static{}
 * */
public class Tv {
	//필드
	static String company = "samsung";
	static String model = "UHD";
	static String info = "UHD";
	static {
		info = company + model; //"samsung UHD";
	}
}
