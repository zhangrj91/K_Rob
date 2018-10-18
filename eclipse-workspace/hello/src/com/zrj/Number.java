package com.zrj;

public class Number
{
	public static int count(int m, int n)
	{
		return m * n;
	}
	public static void main(String[] args) throws Exception
	{
		try
		{
			Number n = new Number();
			int result = count(12315, 57856876);
			System.out.println(result);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
