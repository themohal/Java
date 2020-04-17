//NestedTry
class Ehandling2
{
public static void main(String args[])
	{
	int a,b,ans;
		try
		{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		//arithmetic exception
				try {
				ans=a/b;
				System.out.println("Result:"+ans);
				}
				catch(ArithmeticException e)
				{
				System.out.println("Division By Zero");
				}
		}
		catch(NumberFormatException e)
			{
			System.out.println("Invalid Argument Type");
			}	
	}
}