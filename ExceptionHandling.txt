//Exception Handling
class Ehandling
{
public static void main(String args[])
	{
	int valid=0;
	int invalid=0;
	int num;
	for(int i=0;i<args.length;i++)
		{
		try
			{
			num=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
			invalid=invalid+1;
			System.out.println("Invalid Number:"+args[i]);
			continue;//skip next code get back to the loop
			}
			valid=valid+1;
		}
	System.out.println("Valid Number:"+valid);
	System.out.println("Invalid Number:"+invalid);
	}
}