//Inheritance
import java.util.Scanner;
class A
{
int a,b;
void getData(int x,int y);
{x=a;y=b;}
int add()
{
System.out.println("Super Class Method");
return(a+b);
}
}
class B extends A
{
int mul()
{
System.out.println("Sub Class Method");
return(a*b);
}
}
class Inheritance //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	B obj=new B();
	int add,mult;
	obj.getData(5,3);
	add=obj.add();
	mult=obj.mul(); 
	System.out.println("Addition="+add);
	System.out.println("Multiplication="+mult);
	}
}