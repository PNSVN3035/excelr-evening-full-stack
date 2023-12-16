class I
{
	public static void main(String[] args) 
	{
		int firstNum = -5;
		int secondNum = -110;
		int thirdNum = -10;
		int fourthNum = 0;
		int min = (firstNum < secondNum && firstNum < thirdNum 
			&& firstNum < fourthNum) ? 
			firstNum : (secondNum < thirdNum && secondNum < fourthNum)
			? secondNum : (thirdNum < fourthNum) ? thirdNum : fourthNum;
		System.out.println(min);
	}
}
