package poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	//name, age, studentIdë¥? ë°›ì•„?„œ ì´ˆê¸°?™” ?•˜?Š” ?ƒ?„±?ë¥? this?‚¤?›Œ?“œë¥? ?¨?„œ ?ƒ?„±
	Student(String name, int age , String studentId) {
		//this.name = name;
		//this.age = age;
		super(name, age);		
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", ?•™ë²?:" + studentId;
	}
	
}
