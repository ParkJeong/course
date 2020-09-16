package encap.obj;

public class Hotel {
	private Chef chef;
	private Employee emp;
	String s;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return this.chef;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
