//Threads by extending the thread class
import java.lang.Thread;

class A extends Thread //declaring class
{
public void run() //implementing the Run method
	{
	for(int i=1;i<=5;i++)
		{
		System.out.println("From Thread A:"+i);
		}
	System.out.println("Exit From Thread A");
	}
}
//
class B extends Thread //declaring class
{
public void run() //implementing the Run method
	{
	for(int i=1;i<=5;i++)
		{
		System.out.println("From Thread B:"+i);
		}
	System.out.println("Exit From Thread B");
	}
}
class MyThread
{
	public static void main(String args[])
	{
	A obja=new A(); //new born stage
	B objb=new B(); //new born stage
	obja.start(); //starting new thread.we can call run method but it will run in the current stack.
	objb.start(); 
	}
}
