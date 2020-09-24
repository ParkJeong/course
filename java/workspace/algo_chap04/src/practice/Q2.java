package practice;

import java.util.ArrayList;

class Gstack<E> {
	private int max;
	private int ptr;
	private E[] stk;
	
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException(String message) {
			super(message);
		}
	}
	
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException(String message) {
			super(message);
		}
	}
	
	public Gstack(int capacity) {
		super();
		this.max = capacity;
		this.ptr = 0;
		this.stk = (E[]) new Object[capacity];
	}
	
	public E push(E e) throws OverflowGstackException {
		if(ptr >= max) {
			throw new OverflowGstackException("스택이 가득 찼습니다.");
		}
		return stk[ptr++] = e;
	}
	
	public E pop() throws EmptyGstackException {
		if(ptr <= 0) {
			throw new EmptyGstackException("스택이 비어 있습니다.");
		}
		return stk[--ptr];
	}
	
	public E peak() throws EmptyGstackException{
		if(ptr <= 0) {
			throw new EmptyGstackException("스택이 비어 있습니다.");
		}
		return stk[ptr - 1];
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public int indexOf(E e) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public void dump() {
		if(isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return;
		}
		for(int i = ptr - 1; i >= 0; i--) {
			System.out.println(stk[i].toString() + " ");
		}
		System.out.println();
	}
}

public class Q2 {
}
