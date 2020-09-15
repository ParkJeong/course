package inherit.good;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		s.age = 10;
		s.name = "홍길동";
		s.studentId = "111";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 20;
		t.name = "홍길자";
		t.subject = "수학";
		System.out.println(t.info());
		
	}
}
