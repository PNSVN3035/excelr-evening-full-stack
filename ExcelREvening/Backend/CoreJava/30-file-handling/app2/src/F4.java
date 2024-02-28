import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F4
{
	public static void main(String[] args) throws IOException
	{
		//FileWriter out = new FileWriter("test1.txt", true);
		FileWriter out = new FileWriter("test1.txt", false);
		out.write("Hello4444444");
		out.write("test");
		out.write("abc444444");
		out.write("\n");
		out.write("xyz");
		out.write("end444444444");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
