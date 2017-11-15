package p05.bounded;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
     //String str = Util.comapre("a", "b");//Number를 상속받은 객체들만 
	                                       //대상 - 문자열은 올수 없음
	 int result1 = Util.comapre(10, 20);//auto-boxing ,auto-unboxing
	 System.out.println(result1);
	 
	 int result2 = Util.comapre(4.5, 3);//double, int -> Double,Integer
	 System.out.println(result2);
	}

}
