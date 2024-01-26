class G
{
	void test1()
	{
		System.out.println("from test1-G");
	}
}

class H extends G
{
	void test1()
	{
		System.out.println("from test1-H");
	}

	public static void main(String[] args) 
	{
		G g1 = new H(); //here we are crating new object for H
		g1.test1();

		G g2 = new G(); //this is only for G-class
		g2.test1();
		System.out.println("done");
	}
}
