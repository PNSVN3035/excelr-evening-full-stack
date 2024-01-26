interface A
{
    void test1();
}
interface B
{
    void test2();
}
interface C
{
    void test3();
}
interface D
{
    void test4();
}
class V implements A, B, C, D
{

    public void test1()
    {
        System.out.println("test1()");
    }

    public void test2()
    {
        System.out.println("test2()");
    }

    public void test3()
    {
        System.out.println("test3()");
    }

    public void test4()
    {
        System.out.println("test4()");
    }

    public static void main(String[] args)
    {
        V obj = new V();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
    }
}
