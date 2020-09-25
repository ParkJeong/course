package quiz24;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Menu{
	private Map<String, Integer> menuList;
	
	public boolean add(String menu, Integer price) {
		if(menuList.containsKey(menu)) {
			System.out.println("이미 등록된 메뉴입니다.");
			return false;
		}
		menuList.put(menu, price);
		return true;
	}
	
	public void showAllMenu() {
		for(String menu : menuList.keySet()) {
			System.out.println(menu + ": " + menuList.get(menu) + "원");
		}
		
		for(Entry<String, Integer> entry : menuList.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
		}
	}
	
	public boolean modify(String menu, Integer price) {
		if(menuList.containsKey(menu)) {
			menuList.put(menu, price);
			return true;
		}
		System.out.println("없는 메뉴입니다.");
		return false;
	}
	
	public boolean delete(String menu, Integer price) {
		if(menuList.containsKey(menu)) {
			menuList.remove(menu);
			return true;
		}
		System.out.println("없는 메뉴입니다.");
		return false;
	}
	
	
}

public class MapQuiz02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			System.out.println("----메뉴관리-----");
			System.out.println("1. 신규 메뉴 등록");		// 이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기");	// 메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정");		// 변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
			System.out.println("4. 메뉴판 삭제"); 		// 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료");		// 종료
			
			System.out.print(">");
			int option = stdIn.nextInt();
			Menu menuList = new Menu();
			
			String menu;
			int price;
			
			switch(option) {
			case 1:
				System.out.print("메뉴>");
				menu = stdIn.next();
				System.out.print("가격");
				price = stdIn.nextInt();
				
				menuList.add(menu, price);
				break;
			case 2:
				menuList.showAllMenu();
				break;
			case 3:
				System.out.print("메뉴>");
				menu = stdIn.next();
				System.out.print("가격");
				price = stdIn.nextInt();
				
				menuList.modify(menu, price);
				break;
			case 4:
				System.out.print("메뉴>");
				menu = stdIn.next();
				System.out.print("가격");
				price = stdIn.nextInt();
				
				menuList.delete(menu, price);
				break;
			case 5:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 입력입니다.");	
			}
			
			
		}
	}
}
