package p01.exceptions;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		change(dog); // Dog => Animal =>Dog
		
		Cat cat = new Cat();
		change(cat); //Cat => Animal => Dog
		
	}
	
	//매개변수의 다형성
	//Dog ->Animal로 Promotion -> (Dog)animal(Casting)
	private static void change(Animal animal) {
		if(animal instanceof Dog) { //매개변수로 들어온 객체가 원레 Dog이엇나?
		Dog dog = (Dog)animal;
		}
	}
}
	class Animal{}
	
	class Dog extends Animal{}
	class Cat extends Animal{}
