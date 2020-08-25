package chapter06;

public class Student2 {
	private static int serialNum = 1000;
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentId = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSerialNum() {
		//getStudentName();
		//studentName = "이지원";
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
