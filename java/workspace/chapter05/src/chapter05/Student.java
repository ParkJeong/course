package chapter05;

// 접근 제어자 > public
// 클래스 이름 > Student
public class Student {
	// 멤버 변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}

/*
 * public class Person {
 * 	String name;
 * 	int age;
 * 	char gender;
 * }
 * 
 */
/
