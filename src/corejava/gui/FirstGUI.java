package corejava.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstGUI extends JFrame {

	private JTextField txtF;
	private JLabel lbl;
	private JButton btn;
	
	public FirstGUI(){
		
		txtF = new JTextField();
		lbl = new JLabel();
		btn = new JButton("Submit");

		Container cntr = getContentPane();
		GridLayout gLout = new GridLayout(3, 1);
		cntr.setLayout(gLout);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cntr.add(txtF);
		cntr.add(lbl);
		cntr.add(btn);
		
		pack();
		
		ActionListener al = new MyAction();
		txtF.addActionListener(al);
		btn.addActionListener(al);
		
		System.out.println("Form: "+Thread.currentThread().getName());
	}
	
	private class MyAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("From: "+Thread.currentThread().getName());
			if (e.getSource() == txtF) {
				new Thread(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						process();
						lbl.setText("Event on Text Field.");
					}

					private void process() {
						// TODO Auto-generated method stub
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}).start();
				
			} else {
				lbl.setText("Event on Button.");
			}
		}
		
	}
	
}
