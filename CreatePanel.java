package qqloginpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class CreatePanel {
	private static LoginListener ll=null;
	public static JPanel CreateNorthPanel(JFrame jf) {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0,140));
		ImageIcon image=new ImageIcon("images/back.jpg");
		JLabel background=new JLabel(image);
		background.setBounds(0, 0, 426, image.getIconHeight());
		panel.add(background);
		JButton out=new JButton(new ImageIcon("images/closenormal.jpg"));
		out.setBounds(403,0,26,26);
		out.setRolloverIcon(new ImageIcon("images/closehover.jpg"));
		out.setBorderPainted(false);
		panel.add(out);
		
		out.addActionListener(event->jf.dispose());
		return panel;		
	}
	
	public static JPanel CreateWestPanel() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(130,0));
		ImageIcon image=new ImageIcon("images/qq.jpg");
		JLabel background=new JLabel(image);
		background.setBounds(0, 0, 120, 110);
		panel.add(background);
		return panel;
	}
	
	
	
	public static JPanel CreateCenterPanel(JFrame jf) {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		String str[]= {"ssssssss","sssssssssss","sssssssss"};
		JComboBox<Object> jcoCenter=new JComboBox<Object>(str);
		panel.add(jcoCenter);
		jcoCenter.setEditable(true);
		jcoCenter.setBounds(0,15,175,30);
		jcoCenter.setFont(new Font("Calibri",0,13));
		JPasswordField jpaCenter=new JPasswordField();
		jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		jpaCenter.setBounds(0,44,175,30);
		jpaCenter.setPreferredSize(new Dimension(185,25));
		panel.add(jpaCenter);
		ImageIcon image=new ImageIcon("images/keyboard.jpg");
		JButton jbu=new JButton(image);
		jbu.setPreferredSize(new Dimension(22,20));
		jbu.setBorderPainted(false);
		jpaCenter.add(jbu);
		JCheckBox jch1=new JCheckBox("remember passcode");
		jch1.setFocusPainted(false);
		jch1.setFont(new Font("宋体",0,12));
		jch1.setBounds(0, 85, 80, 20);
		panel.add(jch1);
		
		JCheckBox jch2=new JCheckBox("autologin");
		jch2.setFocusPainted(false);
		jch2.setFont(new Font("宋体",0,12));
		jch2.setBounds(0, 85, 80, 20);
		panel.add(jch2);
		ll=new LoginListener(jcoCenter,jpaCenter,jf);
		return panel;
	}
	
	public static JPanel CreateEastPanel() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(100,0));
		JLabel regeist=new JLabel("regeist account");
		regeist.setForeground(new Color(100,149,238));
		regeist.setBounds(0, 13, 60, 30);
		regeist.setFont(new Font("宋体",0,12));
		JLabel regetpwd=new JLabel("reset password");
		regetpwd.setForeground(new Color(100,149,238));
		regetpwd.setBounds(0, 43, 60, 30);
		regetpwd.setFont(new Font("宋体",0,12));
		panel.add(regetpwd);
		panel.add(regeist);
		return panel;
		
	}
	
	public static JPanel CreateSouthPanel() {
		JPanel panel =new JPanel();
		panel.setPreferredSize(new Dimension(0,51));
		panel.setLayout(null);
		JButton jble=new JButton(new ImageIcon("images/singlenormal.jpg"));
		jble.setPreferredSize(new Dimension(40,51));
		jble.setFocusPainted(false);
		jble.setRolloverIcon(new ImageIcon("images/singledown.jpg"));
		jble.setBorderPainted(false);
		jble.setContentAreaFilled(false);
		jble.setBounds(0, 10, 40, 40);
		jble.setToolTipText("mutiaccoundlogin");
		ImageIcon image =new ImageIcon("images/loginnormal.jpg");
		JButton jb=new JButton("loooogin",image);
		jb.setFont(new Font("宋体",0,13));
		jb.setBounds(130, 0, 175, 40);
		
		jb.setHorizontalTextPosition(SwingConstants.CENTER);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBorderPainted(false);
		jb.setRolloverIcon(new ImageIcon("images/loginhover.jpg"));
		JButton jbri=new JButton(new ImageIcon("images/rightnormal.jpg"));
		jbri.setBounds(380,10,40,40);
		jbri.setFocusPainted(false);
		jbri.setBorderPainted(false);
		jbri.setContentAreaFilled(false);
		jbri.setRolloverIcon(new ImageIcon("image/righthover.jpg"));
		jbri.setToolTipText("qrcodelogin");
		panel.add(jbri);
		panel.add(jb);
		panel.add(jble);
		
		jb.addActionListener(ll);
		
		return panel;
		
	}
}
