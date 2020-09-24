package api.util.date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		// Calendar 컴퓨터 운영체제에 있는 달력관련 기능을 사용
		// Calendar cal = new Calendar(); 싱글톤 패턴이다.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초", year, month, date, hour, minute, second);
	}
}
