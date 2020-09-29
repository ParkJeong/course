package quiz28;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {

		ArrayList<String> products = new ArrayList<>();

		String product = "123123-4564564 GS25(치킨도시락) 4,400원";
		products.add(product);

		product = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		products.add(product);

		product	 = "222222-3333333 MINISTOP(제육볶음) 5,500";
		products.add(product);
		
		String numberPattern = "\\d{6}-\\d{7}";
		String companyPattern = "[A-Z]+[0-9]*";
		String lunchBoxPattern = "([가-힣]+)";
		String pricePattern = "\\d{0,3},\\d{1,3}원?";

		for(String str : products) {
			System.out.println(str);
			Matcher numberMatcher = Pattern.compile(numberPattern).matcher(str);
			Matcher companyMatcher = Pattern.compile(companyPattern).matcher(str);
			Matcher lunchBoxMatcher = Pattern.compile(lunchBoxPattern).matcher(str);
			Matcher priceMatcher = Pattern.compile(pricePattern).matcher(str);

			numberMatcher.find();
			System.out.println("상품번호: " + numberMatcher.group());

			companyMatcher.find();
			System.out.println("회사이름: " + companyMatcher.group());

			lunchBoxMatcher.find();
			System.out.println("도시락명: " + lunchBoxMatcher.group());

			priceMatcher.find();
			System.out.println("가격: " + priceMatcher.group());

			System.out.println("------------------------------");
		}
	}
}
