package generic.basic3;

public class Course <T>{
	
	private String name;
	private T student;
	private String num;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getStudent() {
		return student;
	}
	public void setStudent(T student) {
		this.student = student;
	}
	
	

}
