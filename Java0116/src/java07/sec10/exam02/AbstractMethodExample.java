package java07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		/* 매번 아래처럼 생성하기 싫어!
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
	
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();
		*/
		
		Dog dog = new Dog();
		animalSound(dog);
		
		Cat cat = new Cat();
		animalSound(cat);
		
		animalSound(new Cat()); //-> 이렇게도 가능!
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}