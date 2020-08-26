package practice;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		for(int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			dogs[i].setName("개" + i);
			dogs[i].setType("잡종");
		}
		
		for(Dog d : dogs) {
			System.out.println(d.showDogInfo());
		}
	}
}
