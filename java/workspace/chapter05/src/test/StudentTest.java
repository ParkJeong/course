package test;

import chapter05.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student();
		//studentAhn.studentName = "안승연";
		studentAhn.setStudentName("이상원");
		
		System.out.println(studentAhn.getStudentName());
	}
}
