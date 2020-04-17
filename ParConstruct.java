//Parametrized Constructor
import java.util.Scanner;
class Rectangle
{
int length,width,res;
Rectangle(int x,int y)
{
System.out.println("Parametrized Constructor");
length=x;width=y;
}
void rectArea()
{
res=length*width;
System.out.println("Area of rectangle is:"+res);
}
}
class ParConstruct //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Rectangle obj=new Rectangle(10,10);
	obj.rectArea();	
	}
}