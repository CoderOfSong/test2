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
		this.setTitle("��ȭ��Ϸ");
		JButton btn1 = new JButton("ʯͷ");
		this.add(btn1);
		btn1.setBounds(100,100,90,90);
		JButton btn2 = new JButton("����");
		this.add(btn2);
		btn2.setBounds(200, 100, 90, 90);
		JButton btn3 = new JButton("��");
		this.add(btn3);
		btn3.setBounds(300, 100, 90, 90);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ʯͷ");
				System.out.println(e.getSource());
				l1.setText("�������ʯͷ");
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("���Գ���ʯͷ��ƽ��");	
						break;
					case 1:
						l2.setText("���Գ��ļ�������Ӯ��");
						break;
					case 2:
						l2.setText("���Գ��Ĳ���������");
						break;
				}
				JButton btn=(JButton)e.getSource();
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				l1.setText("������Ǽ���");				
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("���Գ���ʯͷ��������");
						break;
					case 1:
						l2.setText("���Գ��ļ�����ƽ��");
						break;
					case 2:
						l2.setText("���Գ��Ĳ�����Ӯ��");
						break;
				}
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("������ǲ�");
				int m=(int)(Math.random()*3);
				switch(m){
					case 0:
						l2.setText("���Գ���ʯͷ����Ӯ��");
						break;
					case 1:
						l2.setText("���Գ��ļ�����������");
						break;
					case 2:
						l2.setText("���Գ��Ĳ���ƽ��");
						break;
				}
			}
			
		});
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. ����һ������
		FingerGuess f = new FingerGuess();
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// ͬʱ������ʼ����

	}


}
