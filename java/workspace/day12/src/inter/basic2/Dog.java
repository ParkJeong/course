package inter.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("멍멍이는 사료를 먹습니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("멍멍이이는 밖에서 놀아요");
	}

}
