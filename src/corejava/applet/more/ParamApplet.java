package corejava.applet.more;

import java.applet.*;
import java.awt.*;
public class ParamApplet extends Applet
{
String msg;
public void init()
{
System.out.println("init");
this.setBackground(Color.yellow);
}
public void paint(Graphics g)
{
msg=this.getParameter("p1");
System.out.println("paint...");
g.setColor(Color.red);
g.drawLine(10,20,50,50);
g.drawString(msg,100,200);
}

}



