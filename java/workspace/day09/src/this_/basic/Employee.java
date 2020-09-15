package this_.basic;

public class Employee extends Person{
	String department;
	
	Employee(String name, int age, String department){
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.department = department;
	}
}
