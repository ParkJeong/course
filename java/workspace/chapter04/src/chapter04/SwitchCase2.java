package chapter04;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "Gold";

		switch(medal) {
			case "Gold":
				System.out.println("금메달입니다.");
				break;
			case "Silver":
				System.out.println("은메달입니다.");
				break;
			case "Bronze":
				System.out.println("동메달입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");	
				break;
		}

		String floor = "5";

		switch(floor) {
			case "1":
				System.out.println("1층 약국입니다.");
				break;
			case "2":
				System.out.println("2층 정형외과입니다.");
				break;
			case "3":
				System.out.println("3층 피부과입니다.");
			case "4":
				System.out.println("4층 치과입니다.");
			case "5":
				System.out.println("5층 헬스 클럽입니다.");
		}
	}
}
