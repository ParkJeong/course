package day06;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {
	/*
	 * 1. 사람수를 입력받을 수 있습니다.
	 * 2. 입력받은 사람 수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장한다.
	 * 예를 들어서 25를 받으면, 1~25까지 숫자가 중복되지 않게
	 * 크기가 25인 배열에 랜덤하게 배정되면 된다.
	 * 
	 * 3. 해당 배열의 크기만큼 ○으로 출력해주세요.(ㅁ한자9)
	 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있다.
	 * 5. 제대로 된 좌석이라면 자리번호를 공개하면 되고, 제대로 선택되지 않은 좌석이면
	 *    "경고문을 띄워주세요"
	 *    
	 * 선택된 자리는 ●로 다시 표기해주세요
	 */


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("배정할 좌석의 크기를 지정하세요>");
		int number = scan.nextInt();
		int[] seats = new int[number];
		int count = 0;
		int randomNum = 0;
		boolean isFound;

		for(int i = 0; i < number; i++) {
			
			isFound = false;
			while(!isFound) {
				randomNum = (int)(Math.random()*number) + 1;
				isFound = true;
				for(int j = 0; j < count; j++) {
					if(seats[j] == randomNum) {
						isFound = false;
						break;
					}
				}
			}
			seats[count] = randomNum;
			count++;
		}

		System.out.println(Arrays.toString(seats));
		int select;
		while(true) {
			System.out.println("----------------좌석 선택 프로그램---------------------");

			for(int i = 0; i < number; i++) {
				System.out.printf("%-3d ",i+1);
			}
			System.out.println();
			for(int checked : seats) {
				if(checked == -1) {
					System.out.printf("%-4s", "●");
				}
				else {
					System.out.printf("%-4s", "○");
				}
			}

			System.out.println();
			System.out.print("좌석 선택>");
			select = scan.nextInt() - 1;
			if(select >= number || select < 0) {
				System.out.println("잘못된 입력입니다.");
			}
			else if(seats[select] != -1) {
				System.out.println("선택한 좌석: " + seats[select]);
				seats[select] = -1;
			}
			else {
				System.out.println("이미 선택된 좌석입니다.");
			}
		}

	}
}
