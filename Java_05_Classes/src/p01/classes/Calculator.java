package p01.classes;
/* *
 * 계산기 피연산자2, 연산자
 * */


public class Calculator {
	// Example of Encapsulation(정보 은닉화)
	//속성
	private int field1; // 초기값 0
	private int field2; // 초기값 0 
	private char op; //초기값" ";
	
	
	//메소드
	public void setField1(int field1) {
		this.field1 = field1;
	}
	
	public void setField2(int field2) {
		this.field2 = field2;
	}
	
	public void setOp(char op) {
		this.op = op;
	}
	
	
	public void calc() {
		
		switch(op) {
		case '+':
			System.out.println(field1+field2);
			break;
		case '-':
			System.out.println(field1-field2);
			break;
		case 'x':
			System.out.println(field1*field2);
			break;
		case '/':
			System.out.println(field1/field2);
			break;
		
		}
	}
	
	
	
	
	
	//int, int, char 
	public void calc(int field1, int field2, char op) {
		switch(op) {
			case '+':
				System.out.println(field1+field2);
				break;
			case '-':
				System.out.println(field1-field2);
				break;
			case 'x':
				System.out.println(field1*field2);
				break;
			case '/':
				System.out.println(field1/field2);
				break;
		}
	}
}
