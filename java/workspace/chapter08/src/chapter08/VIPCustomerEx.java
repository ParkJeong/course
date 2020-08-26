package chapter08;

public class VIPCustomerEx {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerEx() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}
	
	public int getAgentID() {
		return this.agentID;
	}
	
	public String showCustomerInfo() {
		return this.customerName + " 님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는" + this.bonusPoint + "입니다.";
	}
}
