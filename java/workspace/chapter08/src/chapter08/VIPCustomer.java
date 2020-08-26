package chapter08;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCostomer() 생성자 호출");
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}
	
	
	public int getAgentID() {
		return this.agentID;
	}
}
