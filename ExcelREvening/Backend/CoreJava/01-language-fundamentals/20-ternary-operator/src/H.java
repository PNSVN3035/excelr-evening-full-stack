class H
{
	public static void main(String[] args) 
	{
		int firstNum = 15;
		int secondNum = 12;
		int thirdNum = 10;
		int min = (firstNum < secondNum && firstNum < thirdNum) ? 
			firstNum : ((secondNum < thirdNum) ? secondNum : thirdNum);
		System.out.println(min);
	}
}
