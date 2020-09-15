package overriding.basic;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		p.method01();
		p.method02();

		c.method01();
		c.method02();
	}
}
