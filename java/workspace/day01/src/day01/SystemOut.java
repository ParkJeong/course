package day01;

public class SystemOut {
	public static void main(String[] args) {

		/*
		 * 코드 실행 단축키 ctrl + f11
		 * sysout + ctrl + space를 누르면 println()이 자동 생성된다.
		 * 되돌리기 ctrl + z
		 * 정렬 ctrl + a > ctrl + i  전체 선택 후 정렬
		 * alt + 방향키 를 이용하여 코드를 옮길 수 있다.
		 * 이름을 동시에 변경하고 싶을 때 alt + shift + r
		 * */

		//		1. 개행을 포함하는 println()
		System.out.println("안녕하세요");
		System.out.println("반가워요~");

		//		2. 개행이 없는 print()
		System.out.print("줄바꿈이 없음...");
		System.out.print("코드를 가로로 출력할 때 사용한다.\n");

		//		

		//		\n 줄바꿈
		//		\t 8칸 탭 정렬
		//		%s 문자열을 입력받음
		//		%d 정수를 입력받음
		//		%f 실수를 입력받음
		//		%c 문자를 입력받음
		//		3. 형식지정 출력문 printf()
		System.out.printf("안녕하세요. 제 이름은 %s이고 오늘 날짜는 %d월 %d일 입니다.\n", "홍길동", 8, 20);
		System.out.printf("파이값은 %.2f 입 니다", 3.14);
	}
}
