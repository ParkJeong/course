package poly.instanceof_;

//�?모클?��?��
public class Person extends Object {

	String name;
	int age;
	
	Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println( this );
	}
	
	Person(String name) {
		this(name, 1);
//		this.name = name;
//		this.age = 1;
	}
	
	Person() {
		this("?��름�?�정", 1);
		//this.name = "?��름�?�정";
		//this.age = 1;
	}

	String info() {
		return "?���?:" + name + ", ?��?��:" + age;
	}
}
