package com.app.org;

public class Emp {
	//id(int), name, deptId(string) , basic(double)
	//Emp id should NOT be accepted from user. It should be auto generated , in auto increment manner
	//Get emp details -- using overriding form of toString
private int id=1;
private String name;
private String deptId;
private double basic;

Emp(int id, String name, String deptId,double basic)
{
	this.id=id;
	
	this.name=name;
	this.deptId=deptId;
	this.basic=basic;
	
}

public double getBasic() {
	return basic;
}
public void setBasic(double incr) {
	this.basic=this.basic+incr;
}

@Override
public String toString()
{
	return "ID: "+this.id+" Name: "+this.name+" DeptId: "+this.deptId+" Basic: "+this.basic;
}

}
