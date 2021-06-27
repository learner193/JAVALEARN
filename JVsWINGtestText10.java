package package1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class JVsWINGtestText10 {
	private static JFrame jf=new JFrame();
	public static void initlogin() {
		jf.setSize(426, 300);
		jf.setLocation(200,300);
		jf.setUndecorated(true);
		jf.setResizable(false);
	}
	
	BorderLayout borderlayout=new BorderLayout();
	
	
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(JVsWINGtestText10::CreateGui);
		
	}
	private static void CreateGui() {
		JFrame f=new JFrame("Jcombobox");
		f.setLayout(new BorderLayout());
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1=new JLabel("l1l1l1��������ŶŶŶ",JLabel.CENTER);
		label1.setFont(new Font("����",Font.PLAIN,20));
		
		JPopupMenu popupmenu=new JPopupMenu();
		JMenuItem item3=new JMenuItem("look");
		JMenuItem item4=new JMenuItem("refresh");
		popupmenu.add(item3);
		popupmenu.addSeparator();
		popupmenu.add(item4);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton()==MouseEvent.BUTTON3) {
					popupmenu.show(e.getComponent(),e.getX(),e.getY());
				}
			}
		});
		
		
		JComboBox<String>combobox=new JComboBox<>();
		combobox.addItem("select city");
		combobox.addItem("beijing");
		combobox.addItem("shenzhen");
		combobox.addItem("lallaa");
		
		JTextField textfield=new JTextField(20);
		combobox.addActionListener(e->{
			String item=(String)combobox.getSelectedItem();
			if ("select city".equals(item)) {
				textfield.setText("");
			}else {
				textfield.setText("selected city: "+item);
			}
			
		});
		
		JMenuBar menubar=new JMenuBar();
		JMenu menu1=new JMenu("files(F)");
		JMenu menu2=new JMenu("help(H)");
		menubar.add(menu1);
		menubar.add(menu2);
		JMenuItem item1=new JMenuItem("new(N)");
		JMenuItem item2=new JMenuItem("exit(X)");
		menu1.add(item1);
		menu1.add(item2);
		menu1.addSeparator();
		
		item1.addActionListener(e->{
			JDialog dialog1=new JDialog(f,"no tittle",true);
			dialog1.setSize(200,100);
			dialog1.setLocation(300,200);
			dialog1.setVisible(true);
			dialog1.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		});
		item2.addActionListener(e->System.exit(0));
		f.setJMenuBar(menubar);
		
		JPanel panel=new JPanel();
		ButtonGroup group=new ButtonGroup();
		JRadioButton italic1=new JRadioButton("ITALIC");
		JRadioButton bold1=new JRadioButton("BOLD");
		group.add(italic1);
		group.add(bold1);
		ActionListener listener2=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int mode =0;
				if (bold1.isSelected())mode+=Font.BOLD;
				if(italic1.isSelected())mode+=Font.ITALIC;
				label1.setFont(new Font("����",mode,20));				
			}			
		};
		italic1.addActionListener(listener2);
		bold1.addActionListener(listener2);
		
		
		
		JCheckBox italic=new JCheckBox("ITALIC");
		JCheckBox bold=new JCheckBox("BOLD");
		
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int mode =0;
				if (bold.isSelected())mode+=Font.BOLD;
				if(italic.isSelected())mode+=Font.ITALIC;
				label1.setFont(new Font("����",mode,20));				
			}			
		};
		
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		
		
		panel.add(italic);
		panel.add(bold);
		panel.add(italic1);
		panel.add(bold1);
		panel.add(combobox);
		panel.add(textfield);
		
		f.add(label1,BorderLayout.CENTER);
		f.add(panel,BorderLayout.PAGE_START  );
	}
}
