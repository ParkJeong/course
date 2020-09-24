package practice;

class MyStack{
	private int frontPtr;
	private int backPtr;
	private int max;
	private int[] stk;

	
	
	public MyStack(int capacity) {
		super();
		max = capacity;
		frontPtr = 0;
		backPtr = max - 1;
		stk = new int[max];
	}
	
	public int pushFront(int x) {
		if(isFull()) {
			System.out.println("스택이 가득찼습니다.");
			return -1;
		}
		return stk[frontPtr++] = x;
	}
	
	public int pushBack(int x) {
		if(isFull()) {
			System.out.println("스택이 가득찼습니다.");
			return -1;
		}
		return stk[backPtr--] = x;
	}
	
	
	public int popFront(int x ) {
		if(isEmptyFront()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stk[--frontPtr];
	}
	
	public int popBack(int x ) {
		if(isEmptyBack()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stk[++backPtr];
	}
	
	public boolean isEmptyFront() {
		return frontPtr <= 0;
	}

	public boolean isFull() {
		return frontPtr >= backPtr + 1;
	}
	
	public boolean isEmptyBack() {
		return backPtr >= max - 1;
	}
	
	public int peekFront() {
		if(isEmptyFront()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stk[frontPtr - 1];
	}
	
	public int peekBack() {
		if(isEmptyBack()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stk[backPtr + 1];
	}
	
	public void clearFront() {
		frontPtr = 0;
	}
	
	public void clearBack() {
		backPtr = max - 1;
	}
	
	public int size() {
		return frontPtr + (max - backPtr - 1);
	}
	
	public int capacity() {
		return max;
	}
	
	public int indexOfFront(int x) {
		for(int i = frontPtr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOfBack(int x) {
		for(int i = backPtr + 1; i < max; i++) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public void dumpFront() {
		if(isEmptyFront()) {
			System.out.println("스택이 비었습니다.");
			return;
		}
		
		for(int i = 0; i < frontPtr; i++) {
			System.out.println(stk[i] + " ");
		}
		System.out.println();
	}
	
	public void dumpBack() {
		if(isEmptyBack()) {
			System.out.println("스택이 비었습니다.");
			return;
		}
		
		for(int i = max - 1; i > backPtr; i--) {
			System.out.println(stk[i] + " ");
		}
		System.out.println();
	}
}

public class Q3 {
	
}
