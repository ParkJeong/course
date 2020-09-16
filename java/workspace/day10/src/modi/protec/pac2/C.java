package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A{
	public C() {
		super();
		super.bool = true;
		super.method();
		
		A a = new A();
		a.bool = true;
		a.method();
	}

}
