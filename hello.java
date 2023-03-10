package codewithswetha
import java.applet.*;
import java.awt.*;
import java.awt.event.actionlisteener;
public classHelloworld extends applet implements actionlistener
{
public void init()
{
setforeground(colour,black);
}
public void paint(graphics.g)
{
g.drawstring("HelloWorld",80,170);
}
}