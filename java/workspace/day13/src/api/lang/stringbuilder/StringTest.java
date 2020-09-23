package api.lang.stringbuilder;

public class StringTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String s= "";
		for(int i = 0; i <= 300000; i++) {
			s += "A";
		}
		
		start = System.currentTimeMillis() - start;
		
		System.out.println("소요시간: " + start);
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <= 3000000; i++) {
			sb.append("A");
		}
		start = System.currentTimeMillis() - start;
		
		System.out.println("소요시간: " + start);
		
	}
}
