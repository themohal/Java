//creating thread using interface
import java.lang.Runnable;
class A implements Runnable
{
public void run() //implementing the Run method
	{
	for(int i=1;i<=5;i++)
		{
		System.out.println("Thread A");
		}
	}
}
class MyThread2
{
	public static void main(String args[])
	{
	A t=new A(); //new born stage
	Thread obj=new Thread(t);//passing object to thread class to target the job mean run method
	obj.start(); //starting new thread.we can call run method but it will run in the current stack. 
	for(int i=1;i<=5;i++)
		{
		System.out.println("Main Thread");
		}
	}
}
