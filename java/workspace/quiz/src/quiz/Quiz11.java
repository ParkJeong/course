package quiz;

import java.util.Scanner;
import java.util.Arrays;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menu = new String[] {"수박", "사과", "멜론", "포도", "귤"};
		String[] menu2 = new String[5];
		menu2[0] = menu[0];
		menu2[1] = menu[1];
		menu2[2] = menu[2];
		menu2[3] = menu[3];
		menu2[4] = menu[4];
		
		String select;
		int cost = 0;

		System.out.println("구입할 메뉴는?");
		System.out.println(Arrays.toString(menu));
		System.out.print(">");

		select = scan.next();

		switch(select) {
		case "수박":
			cost = 2;
			break;
		case "사과":
			cost = 3;
			break;
		case "멜론":
			cost = 4;
			break;
		case "포도":
			cost = 5;
			break;
		case "귤":
			cost = 6;
			break;
			default:
				System.out.println(select + "은 메뉴에 없습니다.");
				System.out.println("다시 입력해주세요.");
		}
		if(cost != 0)
		System.out.println(select + "의 가격은 " + cost +"만원입니다.");
		
		scan.close();
	}
}
