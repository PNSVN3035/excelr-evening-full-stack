class F
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = 20;
		int thirdNum = 5;
		if(firstNum < secondNum && firstNum < thirdNum)
		{
			System.out.println("smallest: " + firstNum);

		}
		else if(secondNum < thirdNum)
		{
			System.out.println("smallest: " + secondNum);
		}
		else
		{
			System.out.println("smallest: " + thirdNum);
		}
	}
}