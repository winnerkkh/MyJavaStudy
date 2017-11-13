package p04.getterAndSetters;
/* *
 * getters and setters 메소드
 * */

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	

	
	//Shift + Alt + s => generate getter and setter click
	protected int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}

	protected boolean isStop() {
		return stop;
	}

	protected void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;//필드값을 메소드에서 처리
	}
}