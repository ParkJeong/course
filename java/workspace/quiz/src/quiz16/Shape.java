package quiz16;

public abstract class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}
	
	// 오버라이딩을 강제하지 않는 다면 일반 메서드
	public String getName() {
		return "도형이름: " + name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 오버라이딩을 강제화 한다면 추상 메서드
	public abstract double getArea();
	
	
}
