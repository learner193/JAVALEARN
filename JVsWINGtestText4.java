package package1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class JVsWINGtestText4 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVsWINGtestText4::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame f=new JFrame("PaneDemo");
		f.setLayout(new BorderLayout());
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1=new JLabel("l1l1l1",JLabel.CENTER);
		ImageIcon icon =new ImageIcon("what.jpg");
		Image img=icon.getImage();
		img=img.getScaledInstance(300,150, Image.SCALE_DEFAULT);
		icon.setImage(img);
		label1.setIcon(icon);
		JPanel panel=new JPanel();
		JLabel label2=new JLabel("ababbaaaa",JLabel.CENTER);
		panel.add(label2);
		f.add(label1,BorderLayout.PAGE_START);
		f.add(panel,BorderLayout.PAGE_END);
	}
}
