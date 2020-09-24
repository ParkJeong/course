package practice;

class IntAryQueue {
	private int max;
	private int num;
	private int[] que;

	public static class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException(String message) {
			super(message);
		}
	}

	public static class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException(String message) {
			super(message);
		}
	}

	public IntAryQueue (int capacity){
		max = capacity;
		num = 0;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enqueue(int x) throws OverflowIntAryQueueException{
		if(isFull()) {
			throw new OverflowIntAryQueueException("큐가 가득찼습니다.");
		}
		return que[num++] = x;
	}

	public int dequeue() throws EmptyIntAryQueueException{
		if(isEmpty()) {
			throw new EmptyIntAryQueueException("큐가 비었습니다.");
		}
		int target = que[0];

		for(int i = 0; i < que.length -1; i++) {
				que[i] = que[i+1];
		}
		que[num-1] = 0;
		num--;
		return target;
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return -1;
		}
		return que[0];
	}

	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			if(que[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public int size() {
		return num;
	}

	public int capacity() {
		return max;
	}

	public void clear() {
		num = 0;
	}

	public void dump() {
		for(int i = 0; i < num; i++) {
			System.out.println(que[i] + " ");
		}
		System.out.println();
	}
}

public class Q4 {

}
