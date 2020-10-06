package quiz30;

public class MainClass {
	public static void main(String[] args) {
		ThreadLocation threadLocation1 = new ThreadLocation(); 
		ThreadLocation threadLocation2 = new ThreadLocation(); 
		ThreadLocation threadLocation3 = new ThreadLocation(); 
		
		threadLocation1.setName("Location1");
		threadLocation2.setName("Location2");
		threadLocation3.setName("Location3");
		
		threadLocation1.start();
		threadLocation2.start();
		threadLocation3.start();
		
		
		System.out.println("메인 종료");
	}
}
