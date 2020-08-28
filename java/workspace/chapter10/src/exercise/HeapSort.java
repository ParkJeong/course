package exercise;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("HeapSort descending");
		
	}
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}
}
