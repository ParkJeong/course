package quiz17;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 인터페이스 형으로 선언하고, 무한반복문 안에서
		 * 추가, 재생, 종료 메뉴를 입력 받아서 클래스의 각 기능을 실행해 보자.
		 */
		
		SongList musicPlayer = new MelonMusic();
		String menu;
		String song;
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		
		while(!isStop) {
			
			System.out.println("추가, 재생, 종료를 선택해주세요");
			menu = scan.next();
			
			switch(menu) {
			case "추가":
				System.out.println("추가할 곡 이름을 입력해주세요.");
				song = scan.next();
				musicPlayer.insertList(song);
				System.out.println("총 " + musicPlayer.playLength() + "개의 곡이 있습니다.");
				break;
			case "재생":
				musicPlayer.playList();
				break;
			case "종료":
				isStop = true;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
		}
	}
}
