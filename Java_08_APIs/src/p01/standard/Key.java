package p01.standard;

public class Key {
	//필드
	public int number;
	
	//생성자
	Key(int number){
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compare = (Key)obj;
			if(this.number ==compare.number) {
				return true;
			}
		}
		
		return false;
	}

	// Map의 get메소드는 객체의 hash코드값을 키로 하여
	// 객체를 찾아오는 메소드
	// 키가되는 객체의 hash코드값을 같게 하려면
	// 객체의 hashCode(){}메소드를 재정의함.
	// 객체가 가지고 있는 필드의 값을 hash코드값으로 리턴되게
	// 재정의함
	@Override
	public int hashCode() {
		return number;
	}
	
	
}
