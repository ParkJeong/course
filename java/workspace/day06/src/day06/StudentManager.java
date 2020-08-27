package day06;

import java.util.Scanner;

public class StudentManager {
	public static void showIndex(int index, int count) {
		for(int i = 0; i < count; i++) {
			if(i == 0) {
				System.out.println("-----Index의 위치-----");
			}

			if(i == index) {
				System.out.print("X");
			}
			else {
				System.out.print("O");
			}
			if(i == count-1) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];

		// 현재 위치를 나타내는 변수 index, 시작은 -1에서 시작
		int index = -1;
		// 저장된 사람 수를 알기 위한 변수 count
		int count = 0;
		int menu;
		String name;
		String gender;
		String email;
		int age;

		finish: while(true) {
			showIndex(index, count);
			System.out.println("---------------------------");
			System.out.println("[메뉴] 1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.println("메뉴입력>");
			menu = scan.nextInt();

			switch(menu) {
			case 1:
				if(count < 100) {
					System.out.println("-------고객 정보 입력-------");
					System.out.print("이름을 입력해주세요>");
					nameList[count] = scan.next();
					System.out.print("성별을 입력해주세요>");
					genderList[count] = scan.next();
					System.out.print("이메일을 입력해주세요>");
					emailList[count] = scan.next();
					System.out.print("나이를 입력해주세요>");
					ageList[count] = scan.nextInt();
				
					index = count;
					count++;
				}
				else {
					System.out.println("더 만들 수 없습니다.");
				}
				break;
			case 2:
				/*
				 * index <= 0 "이전 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 이전 고객 정보 출력
				 * */
				System.out.println("-------이전 고객 정보-------");
				if(index <= 0) {
					System.out.println("이전 고객정보가 없습니다.");
				}
				else {
					index--;
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);
				}
				break;
			case 3:
				/*
				 * 다음 고객 정보를 출력할
				 * 그렇지 않으면 index를 이동해서 다음 고객 정보를 출력
				 * 
				 */
				System.out.println("-------다음 고객 정보 -------");
				if(index >= count-1) {
					System.out.println("다음 고객정보가 없습니다.");
				}
				else {
					index++;
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);	
				}

				break;
			case 4:
				System.out.println("-------현재 고객 정보-------");
				if(count < 1) {
					System.out.println("현재 고객정보가 없습니다.");
				}
				else {
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);		
				}
				/*
				 * 현재 위치를 출력할 수 있는 조건을 생각해서 현재 조건을 출력하면 된다.
				 * 그렇지 않으면 현재 고객정보가 없습니다.
				 */

				break;
			case 5:
				System.out.println("-------고객 정보 수정-------");
				/*
				 * 현재 위치를 출력할 수 있는 조건을 생각해서
				 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 나이를 입력받고 배열의 값을 수정
				 */
				if(count < 1) {
					System.out.println("수정할 수 있는 고객정보가 없습니다.");
				}
				else {
					System.out.print("이름을 입력해주세요>");
					name = scan.next();
					nameList[index] = name;
					System.out.print("성별을 입력해주세요>");
					gender = scan.next();
					genderList[index] = gender;
					System.out.print("이메일을 입력해주세요>");
					email = scan.next();
					emailList[index] = email;
					System.out.print("나이를 입력해주세요>");
					age = scan.nextInt();
					ageList[index] = age;
				}

				break;
			case 6:
				System.out.println("-------고객 정보 삭제-------");
				/*
				 * 현재 정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열 요소를 당겨와서 덮어 씌운다.
				 * 고객수를 감소
				 * 그렇지 않으면 삭제할 데이터가 없습니다 출력
				 */
				if(count < 1) {
					System.out.println("삭제할 데이터가 없습니다.");
				}
				else {
					for(int i = index; i < count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i+1];
						ageList[i] = ageList[i+1];
					}
					nameList[count-1] = null;
					genderList[count-1] = null;
					emailList[count-1] = null;
					ageList[count-1] = 0;

					count--;
					if(count == index) {
						index = count-1;
					}

				}

				break;
			case 7:
				System.out.println("-----------종료-----------");
				break finish;
			default:
				System.out.println("잘못된 입력입니다.");
			}

		}

		scan.close();

	}
}
