package com.zrj;

public class AnonymityInnerClass
{
	public static void main(String args[])
	{
		OuterClass out = new OuterClass();
		out.doit("aaa");
		
		System.out.println("xxx");
	}
}

class OuterClass
{
	public  void doit(String s)
	{
				new OutInterface(){
				private int i = 0;
				public int getValue()
				{
					System.out.println(s);
					return i;
				}
				public void f()
				{
					System.out.println("f()");
				}
		}.getValue();
	}
}

interface OutInterface 
{
	
}
