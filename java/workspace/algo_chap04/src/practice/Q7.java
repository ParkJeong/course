package practice;

class IntDeck{
	private int front;
	private int rear;
	private int num;
	private int max;
	private int[] que;
	
	
	public class EmptyIntDeckException extends RuntimeException {
		EmptyIntDeckException(){
		}
		EmptyIntDeckException(String message){
			super(message);
		}
	}
	
	public class OverflowIntDeckException extends RuntimeException {
		OverflowIntDeckException(){
		}
		OverflowIntDeckException(String message){
			super(message);
		}
	}
	
	public IntDeck(int capacity) {
		front = 0;
		rear = 0;
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueueFront(int x) throws OverflowIntDeckException{
		if(isFull()) {
			throw new OverflowIntDeckException("큐가 가득찼습니다.");
		}
		if(--front < 0) {
			front = max - 1;
		}
		que[front] = x;
		num++;
		
		return x;
	}
	
	public int enqueueRear(int x) throws OverflowIntDeckException{
		if(isFull()) {
			throw new OverflowIntDeckException("큐가 가득찼습니다.");
		}
		que[rear++] = x;
		num++;
		if(rear >= max) {
			rear = 0;
		}
		return x;
	}
	
	public int dequeueFront() throws EmptyIntDeckException{
		if(isEmpty()) {
			throw new EmptyIntDeckException("큐가 비었습니다.");
		}
		int x = que[front];
		num--;
		if(++front >= max) {
			front = 0;
		}
		
		return x;
	}
	
	public int dequeueRear() throws EmptyIntDeckException{
		if(isEmpty()) {
			throw new EmptyIntDeckException("큐가 비었습니다.");
		}
		num--;
		if(--rear <= -1) {
			rear = max - 1;
		}
		
		return que[rear];
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
}

public class Q7 {

}
