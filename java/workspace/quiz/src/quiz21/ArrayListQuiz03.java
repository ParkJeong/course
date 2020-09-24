package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListQuiz03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<User> list = new ArrayList<>();

		while(true) {
			System.out.println("[ 1. 등록 | 2. 회원정보보기 | 3. 회원정보검색 | 4.회원정보삭제 | 5.종료 ]");
			System.out.println("메뉴입력>");
			int menu = stdIn.nextInt();

			if(menu == 1) {
				// 스캐너로 이름, 나이를 받고 User객체에 저장, list에 추가
				System.out.println("이름>");
				String name = stdIn.nextLine();

				System.out.println("나이>");
				int age = stdIn.nextInt();

				User user = new User(name, age);

				list.add(user);
			} else if(menu == 2) {
				// list 길이만큼 회전하면서 모든 회원정보 출력
				for(User user : list) {
					System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
				}
			} else if(menu == 3) {
				System.out.println("찾으려는 이름>");
				String name = stdIn.nextLine();
				boolean isFound = false;

				for(User user : list) {
					if(user.getName().equals(name)) {
						System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
						isFound = true;
						break;
					}
				}
				if(!isFound) {
					System.out.println(name + "님은 목록에 없습니다.");
				}
				// 찾을 이름을 입력받고, 이름이 있다면 이름, 나이를 출력한다.
				// 찾는 이름이 없으면 ~~님은 목록에 없습니다를 출력
			} else if(menu == 4) {
				// 삭제할 이름을 입력받고, 그 입력받은 이름과 동일하면 User를 삭제
				System.out.println("삭제하려는 이름>");
				String name = stdIn.nextLine();
				boolean isFound = false;
				User user = null;
				
				for(int i = 0; i < list.size(); i++) {
					user = list.get(i);
					if(user.getName().equals(name)) {
						isFound = true;
						break;
					}
				}
				if(isFound) {
					list.remove(user);
					System.out.println("삭제성공");
				}
				else {
					System.out.println(name + "님은 목록에 없습니다.");
				}
			} else if(menu == 5) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
	}
}
