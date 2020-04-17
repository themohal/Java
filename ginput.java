import java.util.Scanner;

class ginput
{
	 public static void main(String args[])
	{
	int a;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter A Number:");
	a=obj.nextInt();
	System.out.println("Square Is="+(a*a));
	}
}