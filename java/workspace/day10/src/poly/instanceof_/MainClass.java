package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Student("ȫ�浿", 20, "123");
		Person lee = new Teacher("�̽�ö", 50, "����");
		Person choi = new Employee("�ְ�â��", 20, "�ǹ���");
		
		printInfo(hong);
	}
	
	public static void printInfo(Person p) {
		// instanceof�� Ŭ���� ĳ���� ����, ���� Ŭ������ Ÿ���� Ȯ���ϱ� ���� ����Ѵ�.
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
