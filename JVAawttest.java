package package1;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class JVAawttest {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVAawttest::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame j=new JFrame("GridLayout");
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
