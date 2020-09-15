package this_.basic;

public class Student extends Person{
	String studentId;
	
	Student(String name, int age, String studentId){
//		super();
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.studentId = studentId;
	}
	
	@Override
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
}
