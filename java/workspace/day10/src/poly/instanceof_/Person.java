package poly.instanceof_;

//λΆ?λͺ¨ν΄??€
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
		this("?΄λ¦λ?Έμ ", 1);
		//this.name = "?΄λ¦λ?Έμ ";
		//this.age = 1;
	}

	String info() {
		return "?΄λ¦?:" + name + ", ??΄:" + age;
	}
}
