package poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	//name, age, studentId�? 받아?�� 초기?�� ?��?�� ?��?��?���? this?��?��?���? ?��?�� ?��?��
	Student(String name, int age , String studentId) {
		//this.name = name;
		//this.age = age;
		super(name, age);		
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", ?���?:" + studentId;
	}
	
}
