package this_.basic;

public class Teacher extends Person{
	String subject;
	
	Teacher(String name, int age, String subject){
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	String info() {
		return super.info() + ", 과목:" + subject;
	}
}
