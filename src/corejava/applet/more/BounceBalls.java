package corejava.applet.more;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
<applet code=BounceBalls width=700 height=500>
</applet>
*/

public class BounceBalls extends Applet implements Runnable
{
        Thread t;
        boolean flag;

        //for Ball1
        int i=7,yy1=4,xx1=5,x1=250,y1=20;

        //for Ball2
        int j=5,yy2=3,xx2=4,x2=250,y2=300;

        //for Ball3
        int k=0,x3=420,y3=200,yy3=2,xx3=3;

        int wd=660,ht=460;
        Color c[]={Color.cyan,Color.lightGray,Color.gray,Color.darkGray,Color.black,Color.red,Color.pink,Color.orange,Color.yellow,Color.green,Color.magenta,Color.blue};
        

        public void init()
        {

	addComponentListener(new ComponentAdapter()
	{
	       public void componentResized(ComponentEvent me)
	       {
		wd=getWidth();
		wd=wd-40;

		ht=getHeight();
		ht=ht-40;
	       }
	});
	t=new Thread(this);
	t.start();
	flag=false;
        }

        public void run()
        {
	while(!flag)
	{
	     //for Ball1
	       if(y1<=0)
	       {
		++i;
		yy1=4;
	       }
	       else if(y1>=ht)
	       {
		++i;
		yy1=-4;
	       }

	       x1+=xx1;
	       y1+=yy1;
	       if(x1<=0)
	       {
		++i;
		xx1=5;
	       }
	       else if(x1>=wd)
	       {
		++i;
		xx1=-5;
	       }

	       if(i>=c.length)
		i=0;

	     //for Ball2
	       if(y2<=0)
	       {
		++j;
		yy2=3;
	       }
	       else if(y2>=ht)
	       {
		++j;
		yy2=-3;
	       }

	       x2+=xx2;
	       y2+=yy2;
	       if(x2<=0)
	       {
		++j;
		xx2=4;
	       }
	       else if(x2>=wd)
	       {
		++j;
		xx2=-4;
	       }

	       if(j>=c.length)
		j=0;

	     //for Ball3
	       if(y3<=0)
	       {
		++k;
		yy3=2;
	       }
	       else if(y3>=ht)
	       {
		++k;
		yy3=-2;
	       }

	       x3+=xx3;
	       y3+=yy3;
	       if(x3<=0)
	       {
		++k;
		xx3=3;
	       }
	       else if(x3>=wd)
	       {
		++k;
		xx3=-3;
	       }

	       if(k>=c.length)
		k=0;

	       try
	       {
		Thread.sleep(20);
	       }catch(Exception e){}
	       repaint();
	}
        }

        public void paint(Graphics g)
        {
	g.setColor(c[i]);
	g.fillOval(x1,y1,20,20);

	g.setColor(c[j]);
	g.fillOval(x2,y2,30,30);

	g.setColor(c[k]);
	g.fillOval(x3,y3,40,40);
        }

        public void stop()
        {
	flag=true;
        }
}