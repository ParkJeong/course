package chapter05;

public class ManTest {
	public static void main(String[] args) {
		Man manJames = new Man();
		manJames.age = 40;
		manJames.name = "James";
		manJames.isMarried = true;
		manJames.numberOfChildren = 3;
		
		System.out.println(manJames.age);
		System.out.println(manJames.name);
		System.out.println(manJames.isMarried);
		System.out.println(manJames.numberOfChildren);
	}
}
