class G 
{
	static int counter;

	{
		counter++; 

	}

	public static void main(String[] args) 
	{
		G obj1 = new G();
		G obj2 = new G();
		G obj3 = new G();
		G obj4 = new G();
		G obj5 = new G();
		G obj6 = new G();
		System.out.println("Number of Objects that got created for G class is: " 
		+ counter);
	}
}
