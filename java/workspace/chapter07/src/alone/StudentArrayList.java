package alone;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("James"));
		studentList.add(new Student("Tomas"));
		studentList.add(new Student("Edward"));
		
		for(int i = 0; i < studentList.size(); i++) {
			studentList.get(i).showStudentInfo();
		}
	}
}
