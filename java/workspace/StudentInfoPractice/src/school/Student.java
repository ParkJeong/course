package school;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	private Subject majorSubject;
//	private Subject[] subjectList;
//	private Score[] scoreList; 

	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, Subject majorSubject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.scoreList = scoreList;
		this.majorSubject = majorSubject;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	public Subject getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	
}
