//Extending and Implementing Interface
import java.util.Scanner;
interface A
{
int roll=101;
void dispa();
}
interface B
{
void dispb();
}
class C implements A,B
{
public void dispa() //defining in class an interface method is public because it is abstract and already public in interface.
{System.out.println("Roll No.="+roll);}
public void dispb()
{System.out.println("Method For B interface");}
}
class ExImInterface //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	C obj=new C();
	obj.dispa();
	obj.dispb();
	}
}