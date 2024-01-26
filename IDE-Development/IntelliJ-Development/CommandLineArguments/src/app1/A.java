package app1;

public class A
{
    public static void main(String[] args)
    {
        System.out.println("Total No. of arguments: " + args.length);

        for(int i = 0; i < args.length; i++)
        {
            System.out.println("argument: " + args[i]);
        }
    }
}
