package com.app.org;

public class Mgr extends Emp{
	
	private double performanceBonus;
	
	public Mgr(String name, String deptId, double basicSal, double performanceBonus) {
		
		super(name,deptId,basicSal);
		this.performanceBonus = performanceBonus;
	}
	
	public double getperformanceBonus() {
		return this.performanceBonus;
	}
	
	public double netSalary() {
		return (getBasicSal() + performanceBonus);
	}

	@Override
	public String toString() {
		return "Manager " + super.toString() + " performanceBonus = Rs. " + performanceBonus;
	}
}
