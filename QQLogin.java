package qqloginpackage;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class QQLogin {
	private static JFrame jf=new JFrame();
	public static void initlogin() {
		jf.setSize(426, 300);
		jf.setLocation(200,300);
		jf.setUndecorated(true);
		jf.setResizable(false);
	
	
	BorderLayout borderlayout=new BorderLayout();
	jf.setLayout(borderlayout);
	JPanel panelnorth=CreatePanel.CreateNorthPanel(jf);
	jf.add(panelnorth,BorderLayout.PAGE_START);
	JPanel panelcenter=CreatePanel.CreateNorthPanel(jf);
	jf.add(panelcenter,BorderLayout.CENTER);
	JPanel panelwest=CreatePanel.CreateWestPanel();
	jf.add(panelwest,BorderLayout.LINE_START);
	JPanel panelsouth=CreatePanel.CreateSouthPanel();
	jf.add(panelsouth,BorderLayout.PAGE_END);
	JPanel paneleast=CreatePanel.CreateEastPanel();
	jf.add(panelsouth,BorderLayout.LINE_END);
	jf.setVisible(true);
	}
}
