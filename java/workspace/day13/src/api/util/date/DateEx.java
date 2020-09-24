package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now = sdf.format(date);
		System.out.println(now);
		System.out.println("---------------------------------");
		
		sdf.applyPattern("yyyyMMdd");
		String now2 = sdf.format(date);
		System.out.println(now2);
		System.out.println("---------------------------------");
		
		sdf.applyPattern("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		String now3 = sdf.format(date);
		System.out.println(now3);
		System.out.println("---------------------------------");
	}
}
