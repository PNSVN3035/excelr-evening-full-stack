class E
{
    enum C
    {
        T1, T2, T3, T4, T5;
        static void test1()
        {
            System.out.println("from test1");
        }

		void test2()
        {
            System.out.println("from test2");
        }
    }
    public static void main(String[] args)
    {
        C c1 = C.T3;
        c1.test1();
        c1.test2();
        System.out.println("-------------");
        C c2 = C.T4;
        c2.test1();
        c2.test2();
        System.out.println("-------------");
    }
}
/*
 1. all constants required no-arg constructor, and compiler keeps no-arg
    constructor.
 */
