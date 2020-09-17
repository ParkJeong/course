package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Student("홍길동", 20, "123");
		Person lee = new Teacher("이승철", 50, "음악");
		Person choi = new Employee("최강창민", 20, "건물주");
		
		printInfo(hong);
	}
	
	public static void printInfo(Person p) {
		// instanceof는 클래스 캐스팅 전에, 실제 클래스의 타입을 확인하기 위해 사용한다.
		if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		} else if (p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.info());
		} else if (p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
		}
	}
}
