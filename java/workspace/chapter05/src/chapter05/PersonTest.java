package chapter05;

public class PersonTest {
	public static void main(String[] args) {
		Person personPark = new Person();
		Person personLee = new Person("이순신", 175, 75);
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		
		System.out.println(personLee.name);
		System.out.println(personPark.name);
	}
}
