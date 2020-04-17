class evenodd

{
	public static void main(String args[])
	{
int count1=0;
int count2=0;
int n=100;
for(int i=1;i<=n;i++)
{
if(i%2==0)
count1++;
}
	System.out.println("EVEN:"+count1);
for(int j=1;j<=n;j++)
{
if(j%2!=0)
count2++;
}
	System.out.println("\nODD:"+count2);
String b=System.Console.readLine("");
System.out.print("+b+");
	}
}
