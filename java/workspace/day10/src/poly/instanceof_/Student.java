package poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	//name, age, studentIdλ₯? λ°μ? μ΄κΈ°? ?? ??±?λ₯? this?€??λ₯? ?¨? ??±
	Student(String name, int age , String studentId) {
		//this.name = name;
		//this.age = age;
		super(name, age);		
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", ?λ²?:" + studentId;
	}
	
}
