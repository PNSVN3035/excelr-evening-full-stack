class TrackResource
{
	synchronized void track1(TrackResource obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by " + t1.getName());
		obj.track2(this);
		System.out.println("test1 end by " + t1.getName());
	}

	synchronized void track2(TrackResource obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by " + t1.getName());
		obj.track1(this);
		System.out.println("test2 end by " + t1.getName());
	}
}
class Train1 extends Thread
{
	TrackResource key1, key2;
	Train1(TrackResource key1, TrackResource key2)
	{
		this.key1 = key1;
		this.key2 = key2;
	}
	
	@Override
	public void run()
	{
		key1.track1(key2); //train1 they won't release the lock, but trying to access another track.
	}
}
class Train2 extends Thread
{
	TrackResource key1, key2;
	Train2(TrackResource key1, TrackResource key2)
	{
		this.key1 = key1;
		this.key2 = key2;
	}
	
	@Override
	public void run()
	{
		key2.track2(key1);
	}
}
public class M6
{
	public static void main(String[] args)
	{
		TrackResource key1 = new TrackResource();
		TrackResource key2 = new TrackResource();
		
		Train1 train1 = new Train1(key1, key2);
		train1.start();
		
		Train2 train2 = new Train2(key1, key2);
		train2.start();
	}
}

/*
 * demonstration of dead lock
 * always avoid calling of synchronized method from another synchronized method.
   by using different reference variable.
 */
