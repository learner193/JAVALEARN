package qqloginpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class LoginListener implements ActionListener{
	private JComboBox<Object> jco;
	private JPasswordField jpa;
	private JFrame jf;
	public LoginListener(JComboBox<Object> jco,JPasswordField jpa,JFrame jf) {
		super();
		this.jco=jco;
		this.jpa=jpa;
		this.jf=jf;
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		String name=(String)jco.getSelectedItem();
		String pwd=new String(jpa.getPassword());
		if(name.equals("ssssssss")&&pwd.equals("111")) {
			jf.dispose();
			JFrame jfn=new JFrame();
			jfn.setSize(289, 687);
			jfn.setLocation(800, 100);
			jfn.setUndecorated(true);
			jfn.setResizable(true);
			jfn.setVisible(true);
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(0,140));
			ImageIcon image=new ImageIcon("images/qqSuccess.jpg");
			JLabel background=new JLabel(image);
			background.setBounds(0,0,289,687);
			panel.add(background);
			JButton out=new JButton(new ImageIcon("images/close2normal.jpg"));
			out.setBounds(265,0,26,26);
			out.setRolloverIcon(new ImageIcon("images/close2hover.jpg"));
			out.setBorderPainted(false);
			panel.add(out);
			jfn.add(panel);
			out.addActionListener(event->jfn.dispose());
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong passcode");
		}
	}
}
