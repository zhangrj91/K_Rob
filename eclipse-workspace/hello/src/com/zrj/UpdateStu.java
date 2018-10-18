package com.zrj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object>
{
	String name;
	long id;
	
	public UpdateStu(String name, long id)
	{
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		UpdateStu upstu = (UpdateStu) o;
		int result = id > upstu.id ? 1:(id == upstu.id ? 0 : -1);
		return result;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("01", "李同学");
		map.put("02", "魏同学");
		map.put("03", "张同学");
		map.put("04", "王同学");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collection<String> coll = map.values();
		it = coll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
