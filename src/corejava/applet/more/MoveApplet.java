package corejava.applet.more;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class MoveApplet extends Applet
{
A a;
int x=10,y=10;
public void init()
{
this.setBackground(Color.yellow);
a=new A();
}
public void paint(Graphics g)
{
if(x>500)
x=0;
g.setColor(Color.red);
g.fillOval(x++,y,50,50);
g.setColor(Color.green);
g.fillOval(500-x,y+50,50,50);
a.move(this);
}
}

/*
<applet code="MoveApplet" height="500" width="500">
</applet>
*/

class A 
{
void move(MoveApplet m)
{
try
{
Thread.sleep(10);
m.repaint();
}
catch(Exception e)
{}
}
}
