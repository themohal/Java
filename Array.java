//Array
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter Size:");
int n=obj.nextInt();
int marks[]=new int[n];
int len=marks.length;
System.out.println("Size Of array:"+len);
System.out.println("Enter "+n+" Elements:");
for(int i=0;i<marks.length;i++)
{
marks[i]=obj.nextInt();
}
int total=0;
System.out.println("Elements are:");
for(int j=0;j<marks.length;j++)
{
System.out.println(marks[j]);
total=total+marks[j];
}
System.out.println("Total:"+total);
}
}
