package com.app.org;
/*4.2 Mgr state  ---id,name,basic,deptId , performanceBonus
Behaviour ----1. get mgr details : via toString
2. compute net salary (formula: basic+perfmonceBonus) 
3. get performance bonus.
 */
public class Mgr extends Emp {
	private double performanceBonus;
	
	public Mgr(int id,String name, String deptId,double basic,double performanceBonus)
	{
		super(id,name,deptId,basic);
		this.performanceBonus=performanceBonus;
	}
	
	@Override
	public String toString()
	{
		return "Manager Data: "+super.toString()+" PerformanceBonus: "+this.performanceBonus; 
	}
	
	public double netSalary()
	{
		return (super.getBasic()+this.performanceBonus);
	}

	public double getPerformanceBonus() {
		return performanceBonus;
	}
	
	
}
