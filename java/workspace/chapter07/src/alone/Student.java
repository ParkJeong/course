package alone;

public class Student {
	private static int serialNum = 1000;
	private int studentID;
	private String name;
	
	public Student( String name) {
		this.studentID = serialNum;
		this.name = name;
		serialNum++;
	}
	
	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void showStudentInfo() {
		System.out.println(this.studentID + ", " + this.name);
	}
}
