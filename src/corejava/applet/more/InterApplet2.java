package corejava.applet.more;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class InterApplet2 extends Applet
{
int x1,y1,x2,y2;
public void init()
{
this.setBackground(Color.yellow);
AppletContext ctx=this.getAppletContext();
InterApplet1 app1=(InterApplet1)ctx.getApplet("inter1");
this.addMouseListener(new MyListener1(app1,this));
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawLine(x1,y1,x2,y2);
}

}
/*
<applet code="InterApplet1" name="inter1" height="200" width="200">
</applet>
<applet code="InterApplet2"  height="200" width="200">
</applet>
*/

class MyListener1 extends MouseAdapter
{
InterApplet1 app1;
InterApplet2 app2;
MyListener1(InterApplet1 app1,InterApplet2 app2)
{
this.app1=app1;
this.app2=app2;
}
public void mousePressed(MouseEvent me)
{
app1.x1=app2.x1=me.getX();
app1.y1=app2.y1=me.getY();

}
public void mouseReleased(MouseEvent me)
{
app1.x2=app2.x2=me.getX();
app1.y2=app2.y2=me.getY();
app2.repaint();
app1.repaint();
}

}




















