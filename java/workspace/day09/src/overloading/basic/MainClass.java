package overloading.basic;

public class MainClass {
	public static void main(String[] args) {
		Basic b = new Basic();
		
		b.input(1);
		b.input("Overloading");
		b.input(1, 10.0);
		b.input(10.0, 1);
		b.input('a', 1, 8.9);
		
	}
}
