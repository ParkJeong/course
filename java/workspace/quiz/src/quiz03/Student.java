package quiz03;

public class Student {
	private static int studentNumber = 0;
	String name;
	int studentId;
	String phoneNumber;
	String gender;
	
	Student(){
		this.studentId = studentNumber;
		studentNumber++;
	}
	Student(String name, String phoneNumber, String gender){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.studentId = studentNumber;
		studentNumber++;
	}
	
	public void move() {
		System.out.println(name + "이 움직입니다.");
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("성별: " + gender);
	}
	
	@Override
	public String toString() {
		return "학번: " + studentId + ", 이름: " + name;
	}
}
