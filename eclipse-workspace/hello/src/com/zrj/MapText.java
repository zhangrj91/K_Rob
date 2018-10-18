package com.zrj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		
		Emp emp = new Emp("351", "张三");
		Emp emp2 = new Emp("512", "李四");
		Emp emp3 = new Emp("853", "王一");
		Emp emp4 = new Emp("125", "赵六");
		Emp emp5 = new Emp("341", "黄七");
		
		map.put(emp.getId(), emp.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		map.put(emp4.getId(), emp4.getName());
		map.put(emp5.getId(), emp5.getName());
		
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("HashMap类实现的Map集合，无序：");
		while(it.hasNext())
		{
			String str = it.next();
			String name = map.get(str);
			System.out.println(str + " " + name);
		}
		
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator<String> iter = treemap.keySet().iterator();
		System.out.println("升序：");
		while(iter.hasNext())
		{
			String str = iter.next();
			String name = map.get(str);
			System.out.println(str + " " + name);
		}
	}
}
