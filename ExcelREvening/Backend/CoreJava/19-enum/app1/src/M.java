class M
{
    enum Enum1
    {
        C1, C2, C3, C4;
    }
    enum Enum2
    {
        T1, T2, T3, T4;
    }
    public static void main(String[] args)
    {
        Enum1 e1 = Enum1.C4;
        System.out.println(e1);
        Enum1 e2 = Enum1.C3;
        System.out.println(e2);
        System.out.println("-----------");
        Enum2 e3 = Enum2.T1;
        System.out.println(e3);
        Enum2 e4 = Enum2.T2;
        System.out.println(e4);
    }
}
//enum can become a member of the class also
//we can develop an enum inside a class as a member of the class
