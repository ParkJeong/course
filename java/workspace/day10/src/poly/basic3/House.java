package poly.basic3;

public class House {
	
	private Person[] people;
	private int count = 0;
	
	public House() {
		people = new Person[300];
	}
	
	public void setIn(Person p) {
		people[count] = p;
		count++;
	}
//	private Student[] students;
//	private Teacher[] teachers;
//	private Employee[] employees;
//	
//	private int count1 = 0;
//	
//	public House() {
//		students = new Student[100];
//		teachers = new Teacher[100];
//		employees = new Employee[100];
//	}
//	
//	public void setIn(Student s) {
//		students[count1] = s;
//		count1++;
//	}
}
