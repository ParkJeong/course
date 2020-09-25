package practice;

class Gqueue<E> {
	private int front;
	private int rear;
	private int num;
	private int max;
	private E[] que;

	public static class EmptyGqueueException extends RuntimeException{
		EmptyGqueueException(){
		}
		EmptyGqueueException(String message){
			super(message);
		}
	}

	public static class OverflowGqueueException extends RuntimeException{
		OverflowGqueueException(){
		}
		OverflowGqueueException(String message){
			super(message);
		}
	}

	public Gqueue(int capacity){
		front = 0;
		rear = 0;
		num = 0;
		max = capacity;

		try {
			que = (E[]) new Object[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}

	public E enqueue(E e) throws OverflowGqueueException{
		if(isFull()) {
			throw new OverflowGqueueException("큐가 가득찼습니다.");
		}
		que[rear++] = e;
		if(rear >= max) {
			rear = 0;
		}
		num++;
		return e;
	}

	public E dequeue() throws EmptyGqueueException{
		if(isEmpty()) {
			throw new EmptyGqueueException("큐가 비었습니다.");
		}
		E e = que[front++];
		if(front >= max) {
			front = 0;
		}
		num--;
		return e;
	}

	public E peek() throws EmptyGqueueException{
		if(isEmpty()) {
			throw new EmptyGqueueException("큐가 비었습니다.");
		}
		return que[front];
	}

	public int indexOf(E e) {
		for(int i = 0; i < num; i++) {
			int index = (front + i) % max;
			if(que[index].equals(e)) {
				return index;
			}
		}

		return -1;
	}

	public int search(E e) {
		for(int i = 0; i < num; i++) {
			int index = (front + i) % max;
			if(que[index].equals(e)) {
				return i + 1;
			}
		}

		return -1;
	}

	public void clear() {
		front = 0;
		rear = 0;
		num = 0;
	}

	public int size() {
		return num;
	}

	public int capacity() {
		return max;
	}

	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비었습니다.");
		} else {
			for(int i = 0; i < num; i++) {
				int index = (front + i) % max;
				System.out.print(que[index].toString() + " ");
			}
			System.out.println();
		}
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

}

public class Q6 {

}
