@FunctionalInterface
interface F
{
	void test1();
}
class G //implements F
{
	public static void main(String[] args) 
	{
		F ref = () -> System.out.println("from test1() implementation");
		ref.test1();
	}
}
class H implements F
{
	public void test1()
	{
		System.out.println("from H test1() implementation");
	}

	public static void main(String[] args) 
	{
		F f1 = new H();
		f1.test1();

		H h1 = new H();
		h1.test1();
	}
}