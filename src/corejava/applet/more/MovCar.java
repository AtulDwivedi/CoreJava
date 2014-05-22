package corejava.applet.more;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;

/*
<applet code="MovCar.class" width=800 height=500 name="app1">
</applet>
*/

public class MovCar extends Applet implements Runnable
{
      Thread t=null;
      Color c=Color.green;
      int x=10,wd=800;

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
	
	t=new Thread(this);
	t.start();
      }


      public void run()
      {
	for(;;)
	{
	       try
	       {
		++x;
		if(x==(wd-200))
		{
		      c=Color.red;
		      repaint();
		      break;
		}
		repaint();
		Thread.sleep(20);
	       }catch(Exception ee){}
	}
      }

      public void stop()
      {
	t=null;
      }

      public void paint(Graphics g)
      {
	g.drawRect(x,400,80,50);
	g.drawOval((x+10),450,20,20);
	g.drawOval((x+50),450,20,20);
	g.drawLine((wd-20),300,(wd-20),490);
	g.setColor(c);
	g.fillOval((wd-70),275,50,50);
      }
}