package algo_chap04;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException(String message) {
			super(message);
		}
	}
	
	public class OverFlowIntStackException extends RuntimeException {
		public OverFlowIntStackException(String message) {
			super(message);
		}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverFlowIntStackException {
		if(ptr >= max) {
			throw new OverFlowIntStackException("스택이 가득 찼습니다.");
		}
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException("스택이 비었습니다.");
		}
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException("스택이 비었습니다.");
		}
		return stk[ptr - 1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public int capacity() {
		return max;
	}
	
	public void clear() {
		for(; ptr > 0; ) {
			stk[--ptr] = 0;
		}
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있다.");
		}
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.println(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
