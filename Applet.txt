//Applet
import java.applet.*;
import java.awt.*;
//using applet tag to run in browser
//<APPLET CODE=ApClass HEIGHT=400 WIDTH=400> </APPLET>
public class ApClass extends Applet
{
public void paint(Graphics g)
	{
	g.drawString("Welcome to EasyTuts4you.com",100,100);
	}
}
