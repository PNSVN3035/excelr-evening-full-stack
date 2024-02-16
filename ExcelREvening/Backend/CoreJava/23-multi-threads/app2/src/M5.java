//static methods in synchronization
class Shared
{
	//as it is static method required class lock
	//every class will be having only one class lock
	synchronized static void test1()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	}
}
class Thread1 extends Thread
{
	@Override
	public void run()
	{
		Shared.test1();
	}
}
class Thread2 extends Thread
{
	@Override
	public void run()
	{
		Shared.test1();
	}
}
public class M5
{
	public static void main(String[] args)
	{	
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();

		Shared.test1();
	}
}

//class lock is only one for one class.
//object lock is different for different objects of the same class.