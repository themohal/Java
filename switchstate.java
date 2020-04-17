//if statements,switch statements,conditional operators
//1st If statement:If statement,If Else,Else If,nested if else
//switch
import java.util.Scanner;
class switchstate
{
	 public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);

    int roll;
	System.out.print("Enter Roll Number:");
	roll=obj.nextInt();
	switch(roll)
	{
	case 101:
	System.out.print("Farjad");
	break;
	case 102:
	System.out.print("Jawad");
	break;
	case 103:
	System.out.print("Raheel");
	break;
	default:
	System.out.print("Not Found");	
	}
}
}