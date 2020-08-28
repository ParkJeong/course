package exercise;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuckSort입니다.");
	}

}
