package inter.basic3;

public class LG implements Printed{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("전원을 켠다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("전원을 끈다.");
		
	}

	@Override
	public void print(String document) {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("문서 내용: " + document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("문서 내용: " + document + ", 색상: " + color);
		
	}

	@Override
	public int copy(int n) {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		return n;
	}

}
