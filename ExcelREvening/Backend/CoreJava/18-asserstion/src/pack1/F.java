package pack1;

class F
{
	public static double test()
	{
		return 90.0;
	}
    public static void main(String[] args)
    {
        System.out.println("begin");
        int i = 10;
        /*
        after colon you must supply something -> literal, valid variable, method calling which is other than void
         */
		int j = 10;
        assert i == 10 : "string";
        assert true : j;
        assert false : test();
        System.out.println("end");
    }
}
