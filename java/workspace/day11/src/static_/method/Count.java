package static_.method;

public class Count {
	public int a;
	public static int b;
	
	// �Ϲ� �޼��� - �Ϲ� ��� ����, ���� ��� ���� ��� ����� ����
	public int method01() {
		a = 10;
		return ++b;
	}
	// ���� �޼��� - static�� ���� ������ �޼��常 ����� ����
	//			- ��, ��ü ������ ���ؼ��� �Ϲ� ������ ����� ����
	public static int method02() {
		//a = 10;
		Count c = new Count();
		c.a = 10;
		return ++b;
	}
}
