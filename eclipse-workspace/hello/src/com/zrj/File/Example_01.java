package com.zrj.File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fs = new FileOutputStream("word.txt");
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用UTF写入");
			ds.writeUTF("使用Chars写入");
			ds.writeBytes("使用Bytes写入");
			ds.close();
			fs.close();
			
			FileInputStream fis = new FileInputStream("word.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
