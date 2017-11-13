package p03.methods;

public class Car {
	//필드
	int gas;
	//생성자
	Car(){}
	//메소드
	void setGas(int gas) {
		this.gas = gas;
				
	}
	
	boolean isLeftGas() { //boolean타입을 리턴하는 boolean타입 메소드
		boolean result;
		if(gas==0) {
			System.out.println("gas가 없습니다");
			result = false;
		}
		
		else {
			System.out.println("gas가 있습니다.");
			result = true;
		}
		
		return result;
	}	
	
	void run() {//리턴문이 없는 void타입의 메소드
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				gas-=1;//gas--;
			}
			else {
				System.out.println("멈춥니다.(gas잔량: "+gas+")");
				return;//여기서의 return문의 역할은 값을 리턴하는용도가아니고,
				       //메소드의 실행을 중지하는 역할.
			}
		}
	}
}
