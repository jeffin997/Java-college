import java.applet.*;
import java.awt.*;
/*
<applet code="emoji.java" width="500" height="300">
</applet>
*/
public class emoji extends Applet{
    public void paint(Graphics g)
    {
    g.setColor(Color.yellow);
    g.fillOval(20,20,150,150);
    g.setColor(Color.black);
    g.fillOval(50,60,15,25);
    g.fillOval(120,60,15,25);
    g.fillArc(55,95,78,50,10,-180);
    g.setColor(Color.green);
   
    }
    }
