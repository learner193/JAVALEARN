package package1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class JVsWINGtestText5 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVsWINGtestText5::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame f=new JFrame("JBUTTON");
		f.setLayout(new BorderLayout());
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1=new JLabel("l1l1l1��������ŶŶŶ",JLabel.CENTER);
		label1.setFont(new Font("����",Font.PLAIN,20));
		
		
		JPanel panel=new JPanel();
		JCheckBox italic=new JCheckBox("ITALIC");
		JCheckBox bold=new JCheckBox("BOLD");
		JCheckBox black=new JCheckBox("black");
		JCheckBox song=new JCheckBox("song");
		
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int mode =0;
				if (bold.isSelected())mode+=Font.BOLD;
				if(italic.isSelected())mode+=Font.ITALIC;
				
				
				
				if(black.isSelected())
					label1.setFont(new Font("����",mode,20));
				if(song.isSelected())
					label1.setFont(new Font("����",mode,20));
			}			
		};
		
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		black.addActionListener(listener);
		song.addActionListener(listener);
		panel.add(italic);
		panel.add(bold);
		panel.add(song);
		panel.add(black);
		
		f.add(label1,BorderLayout.CENTER);
		f.add(panel,BorderLayout.PAGE_END);
	}
}
