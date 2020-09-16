package modi.protec.pac1;

public class B {

	public B() {
		// protected는 같은 패키지라면 사용이 가능함
		A a = new A();
		a.bool = true;
		a.method();
	}
}
