package api.lang.system;

public class SystemEx {
	public static void main(String[] args) {
		System.out.println("~");
		
		// 1970년 1월 1일 00시부터 현재 시간까지 경과시간을 밀리초로 환산
		
		long start = System.currentTimeMillis();
		System.out.println(start);		
		long sum = 0;
		for(long i = 1; i <= 10000000000l; i++)
			sum += i;
		
		start = System.currentTimeMillis() - start;
		
		System.out.println("경과시간: " + start * 0.001 + "초");
		
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
}
