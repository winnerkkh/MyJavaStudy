package p01.synchronize;

import java.util.ArrayList;

public class JoinTest {
	//
	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) {
	  Before bf = new Before("bf");
	  After at = new After("at");
	  After atr = new After("atr");
	  Thread th = new Thread(atr);
	  try {
		  bf.start();
		  bf.join(); //join메소드를 호출한 스레드는 일시정지되어 호출한
		  			 //작업이 완료시까지 기다림.
		  			 //정지->실행상태로 돌아기기 위해서는
		      		 //작업이 완료되거나, 정해진 시간이 지나야 실행상태로 돌아감.
		  at.start();
		  //at.start();
	  }catch(InterruptedException e) {}
	}
}
