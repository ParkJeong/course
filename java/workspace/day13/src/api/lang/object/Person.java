package api.lang.object;

class Human {
	protected void move() {}
	public void eat( ) {}
}

public class Person implements Cloneable{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(this.getName().equals(p.getName())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getName();
	}

	
	// 오버라이딩
	// 객체복사 메서드
	// protected이기 때문에, 사용시 오버라이딩을 통해 생성해야 한다.
	// 또한 Cloneable 인터페이스를 구현해서 사용해야 한다.
	@Override
	protected Object clone() throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "소멸했다");
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
