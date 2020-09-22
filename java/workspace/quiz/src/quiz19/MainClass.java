package quiz19;

public class MainClass {
	public static void main(String[] args) {
		try {
			Calculator calc = new Calculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
