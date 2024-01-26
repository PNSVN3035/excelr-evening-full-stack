interface S
{
    void test1();
}
interface T
{
    void test2();
}
class U implements S, T //Multiple Inheritence through Interface in Java
{
    public void test1()
    {
        System.out.println("from test1()");
    }

    public void test2()
    {
        System.out.println("from test2()");
    }

    public static void main(String[] args)
    {
        U obj = new U();
        obj.test1();
        obj.test2();
    }
}
