package poly.instanceof_;

//Î∂?Î™®ÌÅ¥?ûò?ä§
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
		this("?ù¥Î¶ÑÎ?∏Ï†ï", 1);
		//this.name = "?ù¥Î¶ÑÎ?∏Ï†ï";
		//this.age = 1;
	}

	String info() {
		return "?ù¥Î¶?:" + name + ", ?Çò?ù¥:" + age;
	}
}
