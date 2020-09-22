package exception.multicatch;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * main 메서드 실행 매개값을 주는 방법
		 * run 탭 -> run configuration -> arguments ->
		 */
		try {
			String data1 = args[3];
			Integer.parseInt(data1);
			Math.random();

			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
			System.out.println(args[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개값은 반드시 2개를 전달해주세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력해주세요.");
		} catch (Exception e) {
			// Exception은 모든 실행 예외의 부모클래스이기 때문에 모든 예외를 처리
		}
	}
}
