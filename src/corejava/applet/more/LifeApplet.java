package corejava.applet.more;


/*
<applet code="LifeApplet" height="200" width="200">
</applet>
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class LifeApplet extends Applet
{
String msg;
public void init()
{
System.out.println("init");
this.setBackground(Color.yellow);
}
public void paint(Graphics g)
{
System.out.println("paint...");
g.setColor(Color.red);
g.drawLine(10,20,50,50);
g.drawString(msg,100,200);

}

}



