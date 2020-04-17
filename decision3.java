//if statements,switch statements,conditional operators
//1st If statement:If statement,If Else,Else If,nested if else
//NESTED IF-ELSE
import java.util.Scanner;
class decision3
{
	 public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);

    int a,b,c;
	System.out.print("Enter First Number:");
	a=obj.nextInt();
	System.out.print("Enter 2nd Number:");
	b=obj.nextInt();
        System.out.print("Enter 3rd Number:");
	c=obj.nextInt();
	if(a>b)
    {
	if(a>c)
	{
       System.out.print("Greater Value is:"+a);
	}
	else
	{
	System.out.print("Greater Value is:"+c);
	}
 	   }
	else
    	{
	if(b>c)
	{
       System.out.print("Greater Value is:"+b);
    	}
	else
	{
	System.out.print("Greater Value is:"+c);
	}
	}
}
}
