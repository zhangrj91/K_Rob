package com.zrj.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest
{
	public static void main(String[] args)
	{
		File file = new File("word.txt");
		try
		{
			FileOutputStream out = new FileOutputStream("word.txt");
			byte[] buy = "我有一只小毛驴，我从来也不骑".getBytes();
			out.write(buy);
			out.close();
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		try
		{
			FileInputStream in = new FileInputStream("word.txt");
			byte[] by = new byte[1024];
			int len = in.read(by);
			System.out.println("文件中的信息是 " + new String(by, 0, len));
			in.close();
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
