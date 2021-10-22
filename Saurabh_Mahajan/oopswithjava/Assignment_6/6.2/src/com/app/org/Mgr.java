package com.app.org;

public class Mgr extends Emp
{
	private double performanceBonus;

	public Mgr(String name, String deptId, double basic, double performanceBonus) 
	{
		super(name, deptId, basic);
		this.performanceBonus = performanceBonus;
	}
	
	public Mgr()
	{
		super();
		this.performanceBonus = 0.0;
	}
	
	public String toString()
	{
		return super.toString()+", performanceBonus : "+this.performanceBonus;
	}
	
	public double netSalary()
	{
		return super.getBasic() + this.performanceBonus;
	}

	public double getPerformanceBonus() 
	{
		return performanceBonus;
	}

}
