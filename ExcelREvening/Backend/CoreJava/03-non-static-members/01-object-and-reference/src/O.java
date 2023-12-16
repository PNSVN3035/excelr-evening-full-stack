class O 
{
	int i;

	public static void main(String[] args) 
	{
		O o1 = new O(); //new object creation
		O o2 = o1;	//where ever o1 is pointing o2 also pointing same object
		O o3 = o2;	//where ever o2 is pointing o3 also pointing same object
		O o4 = o3;	//where ever o3 is pointing o4 also pointing same object
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("---------");
		o1.i = 10;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("---------");
		o2.i = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("---------");
		o3.i = 30;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("---------");
		o4.i = 40;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
		System.out.println("done");
	}
}
