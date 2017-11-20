package p07.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
/* *
 * InteAddress클래스
 *  - IP주소 정보를 가지는 객체(자신:local, 상대방:remote의 주소정보)
 * */

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();// 자신의 주소정보얻는메소드getLocalHost()
			System.out.println("내 컴퓨터 ip주소: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com"); //자신의 주소정보 얻는 메소드

			//Domain주소로 ip주소정보를 얻는 메소드: getAllbyName();
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
}
