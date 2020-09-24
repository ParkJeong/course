package generic.basic3;

public class ITBank {
	
	// 제네릭 클래스를 매개변수로 받을 수 있는 메서드
	public void info(Course<Student> t) {
		String num = t.getNum();
		Student s = t.getStudent();
		
		System.out.println("번호:" + num + ", 이름:" + s.getName());
	}
	
	public Course<Student> get(){
		
		Student s = new Student();
		s.setAge(10);
		s.setName("홍길동");
		
		Course<Student> c = new Course<> ();
		c.setNum("1");
		c.setStudent(s);
		return c;
	}
}
