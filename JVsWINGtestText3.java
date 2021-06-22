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

public class JVsWINGtestText3 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVsWINGtestText3::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame f=new JFrame("PaneDemo");
		f.setLayout(new BorderLayout());
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea showArea= new JTextArea(12,34);
		JScrollPane scrollPane=new JScrollPane(showArea);
		showArea.setEditable(false);
		
		JTextField inputField=new JTextField(20);
		JButton btn =new JButton("Send");
		btn.addActionListener(e->{
			String content =inputField.getText();
			if((content!=null)&&(!content.trim().equals(""))){
				showArea.append("inputed content:"+content+"\n");
			}else {
				showArea.append("can't be empty\n");
			}
			inputField.setText("");
		});
		JPanel panel=new JPanel();
		JLabel label=new JLabel("message");
		panel.add(label);
		panel.add(inputField);
		panel.add(btn);
		
		f.add(scrollPane,BorderLayout.PAGE_START);
		f.add(panel,BorderLayout.PAGE_END);
	}
}
