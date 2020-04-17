//Compare to function used to sort.Unicode value for alphabets is in range 65-95
class CompareToAlph
{
	static String str[]={"Bilaspur","Raipur","Madras","Allahabad"};
	public static void main(String args[])
	{
	
	String tmp=null;
	System.out.println("\n\tBefore Sorting: ");
	for(int i=0;i<str.length;i++)
		{
		System.out.println("\n\t"+str[i]);
		}
		for(int i=0;i<str.length;i++)
			{
				for(int j=i+1;j<str.length;j++)
				{
				if(str[i].compareTo(str[j])>0)
					{
					tmp=str[i];
					str[i]=str[j];
					str[j]=tmp;
					}
				
				}
			}

	System.out.println("\n\tAfter Sorting: ");
	for(int i=0;i<str.length;i++)
		{
	System.out.println("\n\t"+str[i]);
		}
	}
}