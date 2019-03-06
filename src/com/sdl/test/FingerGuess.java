package com.sdl.test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class FingerGuess extends JFrame{
	FingerGuess()
	{
		this.setLayout(null);
		JLabel l1=new JLabel("");
		//ImageIcon icon = new ImageIcon("shitou.png,jiandao.png,bu.png");
		
		l1.setBounds(50,50,100,50);
		
		this.add(l1);
		JLabel l2 = new JLabel("");
		l2.setBounds(50,200,200,50);
		this.add(l2);
		this.setTitle("猜拳游戏");
		JButton btn1 = new JButton("石头");
		this.add(btn1);
		btn1.setBounds(100,100,90,90);
		JButton btn2 = new JButton("剪刀");
		this.add(btn2);
		btn2.setBounds(200, 100, 90, 90);
		JButton btn3 = new JButton("布");
		this.add(btn3);
		btn3.setBounds(300, 100, 90, 90);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("石头");
				System.out.println(e.getSource());
				l1.setText("你出的是石头");
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("电脑出的石头，平手");	
						break;
					case 1:
						l2.setText("电脑出的剪刀，你赢了");
						break;
					case 2:
						l2.setText("电脑出的布，你输了");
						break;
				}
				JButton btn=(JButton)e.getSource();
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				l1.setText("你出的是剪刀");				
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("电脑出的石头，你输了");
						break;
					case 1:
						l2.setText("电脑出的剪刀，平手");
						break;
					case 2:
						l2.setText("电脑出的布，你赢了");
						break;
				}
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("你出的是布");
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("电脑出的石头，你赢了");
						break;
					case 1:
						l2.setText("电脑出的剪刀，你输了");
						break;
					case 2:
						l2.setText("电脑出的布，平手");
						break;
				}
			}
			
		});
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. 创建一个窗体
		FingerGuess f = new FingerGuess();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// 同时设置起始坐标

	}


}
