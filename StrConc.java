//Concating String
class StrConc
{
	public static void main(String args[])
	{
	int no=50;
	String str1="Easy"+"Tuts4u";
	String str2=str1+" Channel";
	String str3=str1+str2;
	String str4=no+10+str1;
	String str5=str1+no+10;
	String str6=str1.concat(" Channel");
	String str7="My ".concat(str6);
	System.out.println("New String 1: "+str1);
	System.out.println("New String 2: "+str2);
	System.out.println("New String 3:" +str3);
	System.out.println("New String 4: "+str4);
	System.out.println("New String 5: "+str5);
	System.out.println("New String 6: "+str6);
	System.out.println("New String 7: "+str7);
	
	
	}
}