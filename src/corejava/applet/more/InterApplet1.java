package corejava.applet.more;

import java.applet.*;
import java.awt.*;
public class InterApplet1 extends Applet
{
int x1,y1,x2,y2;
public void init()
{
this.setBackground(Color.yellow);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawLine(x1,y1,x2,y2);
}
}
