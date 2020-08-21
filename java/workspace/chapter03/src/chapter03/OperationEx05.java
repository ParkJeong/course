package chapter03;

public class OperationEx05 {
	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num <<= 2;
		System.out.println(num);
	}
}
