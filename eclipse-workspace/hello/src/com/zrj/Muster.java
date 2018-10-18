package com.zrj;

import java.util.*;

public class Muster
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int) (Math.random()*list.size());
		System.out.println("随机获取数组中的元素" + list.get(i));
		list.remove(2);
		System.out.println("移除之后");
		for(int j = 0; j < list.size(); j++)
		{
			System.out.println(list.get(j));
		}
	}
}
