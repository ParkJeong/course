package algo_chap04;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException(String message) {
			super(message);
		}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException(String message) {
			super(message);
		}
	}
	
	public IntQueue(int capacity) {
		max = capacity;
		front = 0;
		rear = 0;
		num = 0;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueue(int x) throws OverflowIntQueueException{
		if(isFull()) {
			throw new OverflowIntQueueException("큐가 가득찼습니다.");
		}
		
		que[rear++] = x;
		num++;
		
		if(rear >= max) {
			rear = 0;
		}
		
		return x;
	}
	
	public int dequeue() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException("큐가 비었습니다.");
		}
		
		int x = que[front++];
		num--;
		
		if(front >= max) {
			front = 0;
		}
		return x;
	}
	
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
}
