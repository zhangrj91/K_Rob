package com.zrj;

public class Computer
{
	public static int getMaxComm(int m, int n) throws MyException
	{
		if(m <= 0 || n <= 0)
		{
			throw new MyException("不能输入负数");
		}
		if(m < n)
		{
			int temp = m;
			m = n;
			n = temp;
		}
		int r = m % n;
		while(r != 0)
		{
			m = n;
			n = r;
			r = m % n;
		}
		return n;
	}
	public static void main(String[] args)
	{
		try
		{
			int m = 15, n = 75;
			int result = getMaxComm(m, n);
			System.out.println(result);
		} catch (MyException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
