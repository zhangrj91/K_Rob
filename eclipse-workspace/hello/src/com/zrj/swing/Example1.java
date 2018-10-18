package com.zrj.swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class Example1 extends JFrame
{
	public void CreateJFrame(String title)
	{
		JFrame jf = new JFrame();
		Container con = jf.getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		con.add(jl);
		con.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200,150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new Example1().CreateJFrame("创建一个JFrame窗体");
	}
}
