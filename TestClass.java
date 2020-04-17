//Defining a class
import java.util.Scanner;
class Add
{
int a,b,c;
void getData(int x,int y)
{a=x;b=y;}
void add()
{c=a+b;
System.out.println("Addition is="+c);
}
}
class TestClass //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Add obj=new Add();
	obj.getData(100,200);
	obj.add();	
	}
}