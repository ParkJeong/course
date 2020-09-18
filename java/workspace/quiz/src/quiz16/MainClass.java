package quiz16;

public class MainClass {
	public static void main(String[] args) {
		Shape rect = new Rect("사각형", 5);
		System.out.println(rect.getName());
		System.out.println(rect.getArea());
		
		Shape circle = new Circle("원", 5);
		System.out.println(circle.getName());
		System.out.println(circle.getArea());
	}
}
