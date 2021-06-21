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

public class JVsWINGtest2 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVsWINGtest2::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame j=new JFrame("PaneDemo");
		j.setLayout(new GridLayout(10,10));
		j.setSize(500, 500);
		j.setLocation(400, 300);
		Button btn1=new Button("btn1");
		j.add(btn1);
		btn1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClicked1( e);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed ");				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released ");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouse entered ");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouse exited ");
				
			}
			
		});
		
		JTextField txtf=new JTextField(30) ;
		j.add(txtf);
		
		txtf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char keyChar=e.getKeyChar();
				int keyCode=e.getKeyCode();
				System.out.println("key char= "+keyChar);
				System.out.println("key code= "+keyCode);
			}
		});
		
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("window opened! ");
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("window closing! ");
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("window closed! ");
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("window iconified  ");
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("window de iconified  ");
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("window activated  ");
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("window de activated  ");
				
			}
			
		});
		
		JScrollPane scrollpane1=new JScrollPane();
		
		scrollpane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		JPanel panel=new JPanel();
		panel.add(new JButton("button1"));
		panel.add(new JButton("button2"));
		panel.add(new JButton("button3"));
		panel.add(new JButton("button4"));
		panel.add(new JButton("button5"));
		scrollpane1.setViewportView(panel);
		j.add(scrollpane1,BorderLayout.CENTER);
		
		JTextArea showarea1Area=new JTextArea(20,40);
		JScrollPane scrollpane2= new JScrollPane(showarea1Area);
		showarea1Area.setEditable(false);
		scrollpane2.setViewportView(panel);
		
		JTextField inputfield1=new JTextField(20);
		JButton btn8=new JButton("send");
		btn8.addActionListener(e->{
			String content=inputfield1.getText();
			if (content!=null &&!content.trim().equals("")) {
				showarea1Area.append("inputed content: "+content+"\n");
			}else {
				showarea1Area.append("none content>>\n");
			}
			inputfield1.setText("");
		});
		
		JPanel panel1=new JPanel();
		JLabel label2=new JLabel("conversation content");
		panel1.add(label2);
		panel1.add(inputfield1);
		panel1.add(btn8);
		
		j.add(scrollpane2,BorderLayout.PAGE_START);
		j.add(panel1,BorderLayout.PAGE_END);
	}
	public static void mouseClicked1(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			System.out.println("mouse ×ó¼üµã»÷ ");
		}
		if(e.getButton()==MouseEvent.BUTTON3) {
			System.out.println("mouse ÓÒ¼üµã»÷ ");
		}
		if(e.getButton()==MouseEvent.BUTTON2) {
			System.out.println("mouse ÖÐ¼üµã»÷ ");
		}
		if(e.getButton()==4) {
			System.out.println("mouse 4¼üµã»÷ ");
		}
		if(e.getButton()==5) {
			System.out.println("mouse 5¼üµã»÷ ");
		}
	}
}
