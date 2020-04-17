//Parametrized Constructor
import java.util.Scanner;
class Nesting
{
int m,n;
Nesting(int x,int y)
{
m=x;n=y;
}
int largest()
{
if(m>n)
return m;
else 
return n;
}
void disp()
{
int ans;
ans=largest();
System.out.println("Largest value="+ans);
}
}
class NestingMethods //every class name starts with capital letter in Java
{
	 public static void main(String args[])
	{
	Nesting obj=new Nesting(5,10);
	obj.disp();
	}
}