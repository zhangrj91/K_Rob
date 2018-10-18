package com.zrj.swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class MyJDialog extends JDialog
{
	
	private static final long serialVersionUID = 1L;
	
	public MyJDialog(MyFrame frame)
	{
		super(frame, "第一个JDialog窗体", true);
		Container con = getContentPane();
		con.add(new JLabel("ÕâÊÇÒ»¸ö¶Ô»°¿ò"));
		setBounds(120, 120, 100, 100);
	}
}

public class MyFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args)
	{
		new MyFrame();
	}
	
	public MyFrame()
	{
		Container con = getContentPane();
		con.setLayout(null);
		JLabel jl = new JLabel("ÕâÊÇÒ»¸öJFrame´°Ìå"); // ÔÚ´°ÌåÖÐÉèÖÃ±êÇ©
		// ½«±êÇ©µÄÎÄ×ÖÖÃÓÚ±êÇ©ÖÐ¼äÎ»ÖÃ
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		con.add(jl);
		JButton jb = new JButton("弹出对话框");
		jb.setBounds(10, 10, 100, 21);
		jb.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		con.add(jb);
		con.add(jb);
		con.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
