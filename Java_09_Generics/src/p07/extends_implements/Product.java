package p07.extends_implements;

public class Product<T,M> {
	
	//필드
	private T kind;
	private M model;
	
	//메소드
	public T getKind() {return kind;}
	public void setKind(T kind) {this.kind = kind;}
	public M getModel() {return model;	}
	public void setModel(M model) {	this.model = model;	}
}

class Tv{}