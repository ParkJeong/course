package exercise;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort descending");
		
	}
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}
}
