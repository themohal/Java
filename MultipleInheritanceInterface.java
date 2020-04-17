//multipleInheritance
import java.util.Scanner;
class Student
{
int m1,m2;
void getmarks(int x,int y)
{
m1=x;
m2=y;
}
void putmarks()
{
System.out.println("First:"+m1);
System.out.println("Second:"+m2);
}
}
interface Sport
{
int sp=6; 
void spmarks();
}
class Result extends Student implements Sport
{
public void spmarks()
{
System.out.println("Sport Marks="+sp);
}
void disp()
{
putmarks();
spmarks();
int total=sp+m1+m2;
System.out.println("Total="+total);
}
}
class MultipleInheritanceInterface //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Result obj=new Result();
	obj.getmarks(18,85); 
	obj.disp();
	}
}