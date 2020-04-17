//Abstract Class and Method
import java.util.Scanner;
abstract class x
{
abstract void disp();
}
class y extends x
{
void disp()
{
System.out.println("Abstract Method");
}
}
class AbClass //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	y obj=new y();
	obj.disp();
	}
}