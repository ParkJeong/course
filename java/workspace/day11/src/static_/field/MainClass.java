package static_.field;

public class MainClass {
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("�Ϲݸ������:" + c1.a);
		System.out.println("�����������:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("�Ϲݸ������:" + c2.a);
		System.out.println("�����������:" + c2.b);
		
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("�Ϲݸ������:" + c3.a);
		System.out.println("�����������:" + c3.b);
		
		System.out.println("---------------------");
		
		/*
		 * static�� Ŭ���� �ۿ� 1�� �����ȴ�. (��� ��ü�� ���� ���� ���� �Ѵ�.)
		 * ��ü���� ���� "Ŭ������.������" ���� ����Ѵ�.
		 */
		
		Count.b++;
		c3.b = 100;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
	}
	
}
