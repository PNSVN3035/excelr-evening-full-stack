class W
{
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("SIB1 begin: " + "i: " + i + ", " + "j: " + j);
		i += 1;
		j += 1;
		main(null);
		System.out.println("SIB1 again: " + "i: " + i + ", " + "j: " + j);
		i += 2;
		j += i;
		System.out.println("SIB1 end: " + "i: " + i + ", " + "j: " + j);
	}

	static int test1()
	{
		System.out.println("test1 begin: " + "i: " + i + ", " + "j: " + j);
		i += 3;
		j += i;
		main(null);
		System.out.println("test1 again: " + "i: " + i + ", " + "j: " + j);
		i += 4;
		j += i;
		System.out.println("test1 end: " + "i: " + i + ", " + "j: " + j);
		return i + j + 5;
	}

	static int test2()
	{
		System.out.println("test2 begin: " + "i: " + i + ", " + "j: " + j);
		i += 6;
		j += i;
		main(null);
		System.out.println("test2 again: " + "i: " + i + ", " + "j: " + j);
		i += 7;
		j += i;
		System.out.println("test2 end: " + "i: " + i + ", " + "j: " + j);
		return i + j + 8;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin: " + "i: " + i + ", " + "j: " + j);
		i += 9;
		j += i;
		System.out.println("main end: " + "i: " + i + ", " + "j: " + j);
	}
}

/*test1 begin: i: 0, j: 0
main begin: i: 3, j: 3
main end: i: 12, j: 15
test1 again: i: 12, j: 15
test1 end: i: 16, j: 31
test2 begin: i: 52, j: 31
main begin: i: 58, j: 89
main end: i: 67, j: 156
test2 again: i: 67, j: 156
test2 end: i: 74, j: 230
SIB1 begin: i: 74, j: 312
main begin: i: 75, j: 313
main end: i: 84, j: 397
SIB1 again: i: 84, j: 397
SIB1 end: i: 86, j: 483
main begin: i: 86, j: 483
main end: i: 95, j: 578 */