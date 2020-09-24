package generic.basic3;

public class MainClass {
	public static void main(String[] args) {
		// ITBank안에 있는 두가지 메서드를 사용
		
		ITBank it = new ITBank();
		
		Course<Student> course1 = new Course<Student>();
		Course<Student> course2 = new Course<Student>();
		Course<Student> course3 = new Course<Student>();
		
		Student stu1 = new Student("홍길동", 20);
		Student stu2 = new Student("이순신", 30);
		Student stu3 = new Student("김시민", 40);
		
		course1.setStudent(stu1);
		course2.setStudent(stu2);
		course3.setStudent(stu3);
		
		
		it.info(course1);
		it.info(course2);
		it.info(course3);
	}
}
