package p08.abstracts;

public class Fish1 extends Animal{
	@Override
	public void sing() {
		System.out.println("물고기가 운다");
	}
	@Override
	public void fly() {
		System.out.println("물고기가 난다");
	}
	@Override
	public void eat() {
		System.out.println("물고기가 먹는다");
	}
}
