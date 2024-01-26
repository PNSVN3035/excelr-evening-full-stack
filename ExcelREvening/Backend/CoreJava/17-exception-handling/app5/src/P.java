import java.sql.DriverManager;
class P
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("main begin");
		DriverManager.getConnection("");
		Thread.sleep(1000);
		Class.forName("");
		System.out.println("main end");
	}
}
