package quiz02;

public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student("홍길동", 1, 60, 72, 80);
		Student std2 = new Student("이순신", 2, 90, 81, 70);
		
		System.out.println("합계: " + std1.getTotal());
		System.out.println("평균: " + std1.getAvg());

		System.out.println("합계: " + std2.getTotal());
		System.out.println("평균: " + std2.getAvg());
	}
}
