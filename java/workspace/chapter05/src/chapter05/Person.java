package chapter05;

public class Person {
	String name;
	float height;
	float weight;
	char gender;
	boolean married;
	
	// 자바 컴파일러에서 자동으로 제공하는 디폴트 생성자
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	
}
