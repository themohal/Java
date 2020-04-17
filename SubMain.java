import pack3.TestMe;
class sub extends TestMe
{
	int n=200;
	void dispSub()
	{
	System.out.println("Class Sub");
	System.out.println("Value:"+val);
	System.out.println("n="+n);
	}
}
class SubMain
{
	public static void main(String args[])
	{
	sub obj=new sub();
	obj.dispSub();
	}
}