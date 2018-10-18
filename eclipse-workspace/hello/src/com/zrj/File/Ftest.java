package com.zrj.File;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Ftest extends JFrame { // ´´½¨Àà£¬¼Ì³ÐJframeÀà
	private JScrollPane scrollPane;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null; //创建面板对象
	private JTextArea jTextArea = null; //创建文本域对象
	private JPanel controlPanel = null; //创建面板对象
	private JButton openButton = null; //创建按钮对象
	private JButton closeButton = null; // 创建按钮对象
	
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setVgap(1);
			controlPanel = new JPanel();
			controlPanel.setLayout(flowLayout);
			controlPanel.add(getOpenButton(), null);
			controlPanel.add(getCloseButton(), null);
		}
		return controlPanel;
	}
	
	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("Ð´ÈëÎÄ¼þ"); // ÐÞ¸Ä°´Å¥µÄÌáÊ¾ÐÅÏ¢
			openButton
					.addActionListener(new java.awt.event.ActionListener() {
						// °´Å¥µÄµ¥»÷ÊÂ¼þ
						public void actionPerformed(ActionEvent e) {
							// ´´½¨ÎÄ¼þ¶ÔÏó
							File file = new File("word.txt");
							try {
								// ´´½¨FileWriter¶ÔÏó
								FileWriter out = new FileWriter(file);
								// »ñÈ¡ÎÄ±¾ÓòÖÐÎÄ±¾
								String s = jTextArea.getText();
								out.write(s); // ½«ÐÅÏ¢Ð´Èë´ÅÅÌÎÄ¼þ
								out.close(); // ½«Á÷¹Ø±Õ
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("¶ÁÈ¡ÎÄ¼þ"); // ÐÞ¸Ä°´Å¥µÄÌáÊ¾ÐÅÏ¢
			closeButton
					.addActionListener(new java.awt.event.ActionListener() {
						// °´Å¥µÄµ¥»÷ÊÂ¼þ
						public void actionPerformed(ActionEvent e) {
							File file = new File("word.txt"); // ´´½¨ÎÄ¼þ¶ÔÏó
							try {
								// ´´½¨FileReader¶ÔÏó
								FileReader in = new FileReader(file);
								char byt[] = new char[1024]; // ´´½¨charÐÍÊý×é
								int len = in.read(byt); // ½«×Ö½Ú¶ÁÈëÊý×é
								// ÉèÖÃÎÄ±¾ÓòµÄÏÔÊ¾ÐÅÏ¢
								jTextArea.setText(new String(byt, 0, len));
								in.close(); // ¹Ø±ÕÁ÷
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					});
		}
		return closeButton;
	}
	
	public Ftest() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	
	public static void main(String[] args) { // Ö÷·½·¨
		Ftest thisClass = new Ftest(); // ´´½¨±¾Àà¶ÔÏó
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true); // ÉèÖÃ¸Ã´°ÌåÎªÏÔÊ¾×´Ì¬
	}
	/**
	 * @return
	 */
	protected JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getJTextArea());
		}
		return scrollPane;
	}
}
