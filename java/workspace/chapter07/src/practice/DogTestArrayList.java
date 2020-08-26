package practice;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		for(int i = 0; i < 5; i++) {
			Dog dog = new Dog();
			dog.setName("개" + i);
			dog.setType("잡종");
			dogs.add(dog);
		}
		
		for(Dog d : dogs) {
			System.out.println(d.showDogInfo());
		}
	}
}
