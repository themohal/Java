//multilevelInheritance
import java.util.Scanner;
class One
{
int x=10,y=20;
void disp()
{
System.out.println("Method Of Class One");
System.out.println("Value of X:"+x);
System.out.println("Value of Y:"+y);
}
}
class Two extends One
{
void add()
{
System.out.println("Method of class Two");
System.out.println("Addition="+(x+y));
}
}
class Three extends One
{
void mul()
{
System.out.println("Method Of Class Three");
System.out.println("Multiplication="+(x*y));
}
}
class HierarchicalInheritance //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Two obj1=new Two();
	Three obj2=new Three();
	obj1.disp();
	obj1.add();
	obj2.mul();
	}
}