package pack1;

class G
{
    public static void main(String[] args)
    {
        System.out.println("begin");
        assert true : 10;
		assert true : 999999999999L;
        assert true : 90.0D;
        assert true : 90.0F;
        assert true : 'a';
        assert true : "hello";
        assert false : true;
        System.out.println("end");
    }
}
