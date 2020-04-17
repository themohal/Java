//if statements,switch statements,conditional operators
//1st If statement:If statement,If Else,Else If,nested if else
//Simple If statement program
import java.util.Scanner;
class decision1
{
	 public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);

    int bonus,salary;
	System.out.print("Enter Salary:");
	salary=obj.nextInt();
	if(salary>=10000)
    {
        bonus=(salary*10)/100;
        salary=salary+bonus;
    }
    else
    {
        bonus=(salary*5)/100;
        salary=salary+bonus;
    }
	System.out.println("Your Salary is:"+salary);
	}
}
