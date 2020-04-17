//multilevelInheritance
import java.util.Scanner;
class Student
{
int roll;
void getroll(int x)
{
roll=x;
}
void putroll()
{
System.out.println("Roll Number:"+roll);
}
}
class Test extends Student
{
int m1,m2;
void getmark(int x,int y)
{
m1=x;m2=y;
}
void putmark()
{
System.out.println("Test1="+m1);
System.out.println("Test2="+m2);
}
}
class Result extends Test
{
int total;
void disp()
{
putroll();
putmark();
total=m1+m2;
System.out.println("Total Marks="+total);
}
}
class MultiLevelInheritance //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Result s1=new Result();
	s1.getroll(10111);
	s1.getmark(18,85); 
	s1.disp();
	}
}