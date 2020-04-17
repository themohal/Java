//Default Constructor
import java.util.Scanner;
class Construct
{
int a,b;
Construct()
{
System.out.println("Default Constructor");
a=10;
b=20;
}
void disp()
{
System.out.println("Value of A:"+a);
System.out.println("Value of B:"+b);
}
}
class DefConstruct //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Construct obj=new Construct();
	obj.disp();	
	}
}