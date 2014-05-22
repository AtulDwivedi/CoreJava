package corejava.applet.more;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;

/*
<applet code="MovHello.class" width=500 height=500 name="app1">
</applet>
*/

public class MovHello extends Applet implements ActionListener,Runnable
{
      Button start,stop;
      String s="HELLO";
      Thread t=null;
      boolean stopflag;
      int x=0,wd=500;

      public void init()
      {
	setLayout(null);
	addComponentListener(new ComponentAdapter()
	{
	       public void componentResized(ComponentEvent me)
	       {
		wd=getWidth();
	       }
	});
	setFont(new Font("Times New Roman",Font.PLAIN,20));
	setBackground(Color.cyan);
	setForeground(Color.red);

	start=new Button("Start");
	add(start);
	start.addActionListener(this);
	start.setBounds(110,400,80,30);

	stop=new Button("Stop");
	add(stop);
	stop.addActionListener(this);
	stop.setBounds(310,400,80,30);

	stopflag=true;
      }

      public void actionPerformed(ActionEvent e)
      {
	if(e.getSource()==start)
	{
 	     stopflag=false;
	     t=new Thread(this);
	     t.start();
	}
	else if(e.getSource()==stop)
	{
 	     stopflag=true;
	     t=null;
	}
      }

      public void run()
      {
	for(;;)
	{
	       try
	       {
		++x;
		if(x==(wd))
		       x=0;
		repaint();
		Thread.sleep(20);
		if(stopflag)
		   break;
	       }catch(Exception ee){}
	}
      }

      public void stop()
      {
	stopflag=true;
	t=null;
      }

      public void paint(Graphics g)
      {
	g.drawString(s,x,100);
      }
}