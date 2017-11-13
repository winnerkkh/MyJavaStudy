package p08.abstracts;

public class Insect1 extends Animal {
	@Override
	public void sing() {
		System.out.println("벌레가 운다.");
	}

	@Override
	public void fly() {
		System.out.println("벌레가 난다");
	}

	@Override
	public void eat() {
		System.out.println("벌레가 먹는다");
	}
}
