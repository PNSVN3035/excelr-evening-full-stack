class A 
{
	public static void main(String[] args) 
	{
		int[][][] a;
		a = new int[2][][];
		a[0] = new int[2][];
		a[0][0] = new int[3];
		a[0][1] = new int[2];

		a[1] = new int[2][];
		a[1][0] = new int[2];
		a[1][1] = new int[3];

		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;

		a[0][1][0] = 40;
		a[0][1][1] = 50;

		a[1][0][0] = 60;
		a[1][0][1] = 70;

		a[1][1][0] = 80;
		a[1][1][1] = 90;
		a[1][1][2] = 100;


		System.out.println("The value is: " + a[0][0][1]);
		System.out.println("The value is: " + a[0][1][1]);
		System.out.println("The value is: " + a[1][0][1]);
		System.out.println("The value is: " + a[1][1][0]);
	}
}
