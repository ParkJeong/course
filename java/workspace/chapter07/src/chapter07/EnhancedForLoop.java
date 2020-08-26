package chapter07;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "Javascript"
				, "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
