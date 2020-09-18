package abs.bad;

public class Store extends HeadStore{

	@Override
	public void apple() {
		System.out.println("서울 지점에 사과는 500원");
	}

	@Override
	public void banana() {
		System.out.println("서울 지점에 바나나는 500원");
	}

	@Override
	public void melon() {
		System.out.println("서울 지점에 멜론은 500원");
	}

//	@Override
//	public void orange() {
//		// TODO Auto-generated method stub
//		super.orange();
//	}
	// 프로그래머가 실수로 재정의를 까먹었다면?

}
