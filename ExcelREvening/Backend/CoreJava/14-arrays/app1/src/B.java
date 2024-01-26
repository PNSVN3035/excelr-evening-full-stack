public class B
{
	public static void main(String[] args)
	{
		int[] x;
		x = new int[4];
		//default values
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		//recently assigned values
		System.out.println(x.length);
		System.out.println(x[0]);//10
		System.out.println(x[1]);//20
		System.out.println(x[2]);//30
		System.out.println(x[3]);//40
	}
}