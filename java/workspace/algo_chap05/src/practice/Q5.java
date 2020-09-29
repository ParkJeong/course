package practice;

import java.util.Stack;

public class Q5 {
	static void recur3(int n) {
		if(n > 0) {
			recur3(n - 1);
			recur3(n - 2);
			System.out.println(n);
		}
	}
	/*
	 * 1 : 0 -1 > 1
	 * 2 : 1 0 > 1 2
	 * 3 : 2 1 > 12 1 3
	 */
	static void recur4(int n) {
		Stack<Integer> stack = new Stack();
		boolean second = true;

		while(true) {
			if(n > 0) {
				stack.push(n-1);
				n--;
				continue;
			}
			n = stack.pop();
			if(n > 0 && second) {
				stack.push(n-2);
				n -= 2;
				continue;
			}
			second = false;
			if(!stack.isEmpty()) {
				n = stack.pop();
				System.out.println(n);
				continue;
			}


			break;
		}
	}
}
