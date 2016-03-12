package corejava.applet.more;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class MainApplet extends Applet
{
public void init()
{
this.setBackground(Color.yellow);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString("hello",100,200);
main(null);
}

public static void main(String g[])
{
System.out.println("main...");
}
}
/*
<applet code="MainApplet" height="200" width="200">
</applet>
*/



