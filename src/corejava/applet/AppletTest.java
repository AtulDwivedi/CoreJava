package corejava.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * <applet code="SampleApplet.class" width="250" height="130"/>
 * 
 */

public class AppletTest extends Applet {
	
	JTextField t1;
	JTextField t2;
	JButton btn;
	Container c;
	
	@Override  
	public void init() {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame();
		//c=getContantP
		GridLayout gl = new GridLayout(3,1);
		frm.setLayout(gl);
		t1 = new JTextField(50);
		t2 = new JTextField(50);
		btn = new JButton("Add");
		setVisible(true);
		setBackground(Color.YELLOW);
		setForeground(Color.GREEN);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	public void paint(Graphics g){
		//add(gl);
		add(t1);
		add(t2);
		add(btn);
	}
}
