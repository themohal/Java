//Parametrized Constructor
import java.util.Scanner;
class Test
{
static int cube(int x)
{
return(x*x*x);
}
}
class StaticMethods //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	int res=Test.cube(5);
	System.out.println("Cube="+res);
	}
}