class K extends Thread
{
	@Override
	public void run()
	{
		System.out.println("from run method of K class");
		Thread t1 = Thread.currentThread();
		System.out.println("child thread priority: " + t1.getPriority() + " from run method");
		System.out.println("from child: " + t1.getName() + " from run method");
	}
}
public class M14
{   
	public static void main(String[] args)
	{
		K k1 = new K();
		k1.start();//two threads are involved
		System.out.println(k1.getName() + " from main method");
		k1.setName("first child");
		System.out.println(k1.getName() + " from main method");
		Thread t1 = Thread.currentThread();
		System.out.println("main thread priority: " + t1.getPriority() + " from main method");
		System.out.println("from main: " + t1.getName() + " from main method");
	}
}
