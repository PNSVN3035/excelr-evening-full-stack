class F
{
    public static void main(String[] args)
    {
        F f1 = new F();
        final F f2 = new F();
		f1 = f2;
		f2 = f1;
		f2 = null;
		f2 = new F();
        System.out.println("done");
    }
}
