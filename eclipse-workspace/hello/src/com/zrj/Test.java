package com.zrj;

import java.util.*;
public class Test
{
	public static void main(String[] args)
	{
		Map<String, Emp> map = new HashMap<>();
		Emp emp = new Emp("351", "张三");
		Emp emp2 = new Emp("512", "李四");
		Emp emp3 = new Emp("853", "王一");
		Emp emp4 = new Emp("125", "赵六");
		Emp emp5 = new Emp("341", "黄七");
		map.put(emp.getId(), emp);
		map.put(emp2.getId(), emp2);
		map.put(emp3.getId(), emp3);
		map.put(emp4.getId(), emp4);
		map.put(emp5.getId(), emp5);
		
	}
}
