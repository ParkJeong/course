package inter.basic2;

// implements 키워드는 extends보다 뒤에 있어야 한다.
public class Cat extends Animal implements IPet {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("냥냥이는 생선을 좋아해요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("냥냥이는 방에서 놀아요");
	}

}
