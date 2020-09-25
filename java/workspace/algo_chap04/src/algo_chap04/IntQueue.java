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
	
	public int peek() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException("큐가 비었습니다");
		}
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int index = (front + i) % max;
			if(que[index] == x) {
				return index;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = 0;
		front = 0;
		rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public void dump() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
		} else {
			for(int i = 0; i < num; i++) {
				int index = (front + i) % max;
				System.out.print(que[index] + " ");
			}
			System.out.println();
		}
	}
	
	public int search(int x) {
		for(int i = 0; i < num; i++) {
			int index = (front + i) % max;
			if(que[index] == x) {
				return i + 1;
			}
		}
		return 0;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
}
