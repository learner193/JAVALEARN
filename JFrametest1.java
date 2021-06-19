package package1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class JFrametest1 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JFrametest1::createAndShowGUI);
		SwingUtilities.invokeLater(JFrametest1::createAndShowGUI2);
		
	}
	private static void createAndShowGUI() {
		JFrame frame=new JFrame("JFrameTest");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(100,100);
		frame.setVisible(true);
		
		JButton bt1=new JButton("pagestart");
		JButton bt2=new JButton("pageend");
		JButton bt3=new JButton("linestart");
		JButton bt4=new JButton("lineend");
		JButton bt5=new JButton("center");
		
		frame.add(bt1,BorderLayout.PAGE_START);
		frame.add(bt2,BorderLayout.PAGE_END);
		frame.add(bt3,BorderLayout.LINE_END);
		frame.add(bt4,BorderLayout.LINE_START);
		frame.add(bt5,BorderLayout.CENTER);
		
//		JDialog dialog=new JDialog(frame,"Jdialog window",true);
//		dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
//		dialog.setSize(100,200);
//		dialog.setVisible(true);
		
		
		
	}
	private static void createAndShowGUI2() {
	
		JFrame f2=new JFrame("JFrameTest");
		f2.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f2.setSize(400,2000);
		f2.setLocation(300,200);
		
		JButton bt1=new JButton("pagestart");
		JButton bt2=new JButton("pageend");
		JButton bt3=new JButton("linestart");
		JButton bt4=new JButton("lineend");
		JButton bt5=new JButton("center");
		JButton bt6=new JButton("center");
		JButton bt7=new JButton("center");
		JButton bt8=new JButton("center");
		JButton bt9=new JButton("center");
		JButton bt10=new JButton("center");
		
		f2.add(bt1);
		f2.add(bt2);
		f2.add(bt3);
		f2.add(bt4);
		f2.add(bt5);
		f2.add(bt6);
		f2.add(bt7);
		f2.add(bt8);
		f2.add(bt9);
		
		
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
}
