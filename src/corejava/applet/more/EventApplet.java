package corejava.applet.more;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class EventApplet extends Applet
{
	int x1,y1,x2,y2;
	public void init()
	{
		this.setBackground(Color.yellow);
		this.addMouseListener(new MyListener(this));
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(x1,y1,x2,y2);
	}

}
/*
<applet code="EventApplet" height="200" width="200">
</applet>
 */

class MyListener extends MouseAdapter
{
	EventApplet app;
	MyListener(EventApplet app)
	{
		this.app=app;
	}
	public void mousePressed(MouseEvent me)
	{
		app.x1=me.getX();
		app.y1=me.getY();

	}
	public void mouseReleased(MouseEvent me)
	{
		app.x2=me.getX();
		app.y2=me.getY();
		//app.repaint();
		//app.update(app.getGraphics());
		app.paint(app.getGraphics());
	}

}













