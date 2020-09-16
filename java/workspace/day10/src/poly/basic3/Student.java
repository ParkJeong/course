package poly.basic3;

public class Student extends Person {

	String studentId;
	
	//name, age, studentId를 받아서 초기화 하는 생성자를 this키워드를 써서 생성
	Student(String name, int age , String studentId) {
		//this.name = name;
		//this.age = age;
		super(name, age);		
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
	
}
