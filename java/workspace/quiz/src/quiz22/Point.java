package quiz22;

import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint{
	
	@Override
	public void showPointUI() {
		
	}

	@Override
	public void input(List<Student> students) {
		Student newStudent = new Student();
		newStudent.inputStuInfo();
		
		for(Student student : students) {
			if(newStudent.getStuId().equals(newStudent.getStuId())) {
				System.out.println("이미 등록된 학번입니다.");
				return;
			}
		}
		
		students.add(newStudent);
		System.out.println(newStudent.getName() + "님의 성적 정보가 정상적으로 입력되었습니다.");
	}

	@Override
	public void showAll(List<Student> students) {
		int total = 0;
		
		for(Student student : students) {
			total += student.getTotal();
			student.outputInfo();
		}
		System.out.println();
		System.out.println("우리 반의 전체 평균: " + (double)total/students.size());
	}

	@Override
	public void search(List<Student> students) {
		
		Scanner stdIn = new Scanner(System.in);
		String stuId = stdIn.nextLine();
		
		for(Student student : students) {
			if(student.getStuId().equals(stuId)) {
				student.outputInfo();
				return;
			}
		}
		System.out.println(stuId +"학번의 학생이 없습니다.");
	}

	@Override
	public void modify(List<Student> students) {
		Scanner stdIn = new Scanner(System.in);
		String stuId = stdIn.nextLine();

		for(Student student : students) {
			if(student.getStuId().equals(stuId)) {
				student.modify();
				return;
			}
		}
		System.out.println(stuId +"학번의 학생이 없습니다.");
	}

	@Override
	public void delete(List<Student> students) {
		Scanner stdIn = new Scanner(System.in);
		String stuId = stdIn.nextLine();

		for(Student student : students) {
			if(student.getStuId().equals(stuId)) {
				students.remove(student);
				return;
			}
		}
		System.out.println(stuId +"학번의 학생이 없습니다.");
	}

}
