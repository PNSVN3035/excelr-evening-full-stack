import java.text.ParseException;
import java.text.SimpleDateFormat;
class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try
		{
			df.parse("");
		}
		catch (ParseException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
