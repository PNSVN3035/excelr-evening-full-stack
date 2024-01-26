package production;
import pack1.*;
import pack1.pack11.*;
import pack2.*;
import pack2.pack22.*;

public class MainDriver
{
	public static void main(String[] args)
	{
		System.out.println("one");
		A.main(args);
		System.out.println("two");
		B.main(args);
		System.out.println("three");
		C.main(args);
		System.out.println("four");
		D.main(args);
		System.out.println("five");
	}
}
