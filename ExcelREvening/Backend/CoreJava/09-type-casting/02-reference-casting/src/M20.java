class M20 
{
	public static void test(Object object) 
	{
		if(object instanceof Object)
		{
			if(object instanceof Object)
			{
				Object obj = (Object) object;
				System.out.println("Casting to Object");
			}

			if(object instanceof Ancestor)
			{
				Ancestor obj = (Ancestor) object;
				System.out.println("Casting to Ancestor");
			}

			if(object instanceof GrandFather)
			{
				System.out.println("Casting to GrandFather");
				GrandFather obj = (GrandFather) object;
			}

			if(object instanceof Father)
			{
				System.out.println("Casting to Father");
				Father obj = (Father) object;
			}

			if(object instanceof Son)
			{
				System.out.println("Casting to Son");
				Son obj = (Son) object;
			}
		}
	}

	public static void main(String[] args) 
	{
		Object obj1 = new Object();
		test(obj1);
		System.out.println("-------------------");
		Object obj2 = new Ancestor();
		test(obj2);
		System.out.println("-------------------");
		Object obj3 = new GrandFather();
		test(obj3);
		System.out.println("-------------------");
		Object obj4 = new Father();
		test(obj4);
		System.out.println("-------------------");
		Object obj5 = new Son();
		test(obj5);
		System.out.println("-------------------");			
	}
}