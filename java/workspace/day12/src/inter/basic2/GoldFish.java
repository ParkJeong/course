package inter.basic2;

public class GoldFish extends Fish implements IPet{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("금붕어는 어항에서 헤엄쳐요");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("금붕어는 어항에서 놀아요");
	}
	

}
