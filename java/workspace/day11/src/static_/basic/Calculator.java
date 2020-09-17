package static_.basic;

public class Calculator {
	/*
	 * ���� ���� �����̳� ������� �ٸ��� ������ �Ϲ� ��� ������ �ȴ�.
	 * ���� ���� �������� �����ϱ� ������ static������ �����ϴ°� ����.
	 */
	
	String color;
	int result;
	static double pi = 3.14;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	/*
	 * �Ϲ� ��� ������ �����ϴ� �޼���� static �޼���� �����ϸ�
	 * �ȵȴ�.
	 */
	
	public void add(int n) {
		result += n;
	}
	
	/*
	 * �޼��� ���ο��� �Ϲ� ��� ������ ���� �ʰ�
	 * ���뼺 �ְ� ����ϴ� �޼���� static Ű���带 ����ϴ� ���� ����.
	 */
	
	public static double circle(int r) {
		return r * r * pi;
	}
}
