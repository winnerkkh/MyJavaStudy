package p03.methods;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		//직사각형의 넓이
		double result1=myCal.areaRectangle(10);
		//직사각형의 넓이
		double result2=myCal.areaRectangle(10, 20);
		
		//결과출력
		System.out.println("직사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
	}
}
