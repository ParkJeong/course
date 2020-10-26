package main;

import java.util.Scanner;

import library_test.member.dao.MemberDAO;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.회원, 2.책, 3.대여목록확인, 4.종료");
			String menu = stdIn.next();
			
			switch (menu) {
			case "1":
				MemberDAO memberDAO = new MemberDAO();
				memberDAO.selectMenu();				
				break;
			case "2":
				
				break;

			case "3":
				
				break;
			case "4":
				flag = false;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
