package com.zrj;

public class Emp
{
	private String e_id;
	private String e_name;
	public Emp(String e_id, String e_name)
	{
		this.e_id = e_id;
		this.e_name = e_name;
	}
	
	public String getId()
	{
		return e_id;
	}
	
	public String getName()
	{
		return e_name;
	}
	
	public void setId(String e_id)
	{
		this.e_id = e_id;
	}
	
	public void setName(String e_name)
	{
		this.e_name = e_name;
	}
}
