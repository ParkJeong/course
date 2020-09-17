package static_.method;

public class MainClass {
	public static void main(String[] args) {
		Count.b++;
		Count.method02();
		
		Count c = new Count();
		c.a = 10;
		c.method01();
	}
}
