import java.util.Scanner;
class O
{
	public static void main(String[] args) //throws InsufficientBalanceException
	{
		System.out.println("Welcome to your Account");
		System.out.println("Your Balance is 10,000.0 Rupees");
		Scanner sc = new Scanner(System.in);
		int i;
		do
		{
			System.out.println("Enter the amount to be withdrawn");

			i = sc.nextInt();

			if (!(i <= 0) && i <= 10000)
			{
				break;
			}

			if(i > 10000)
			{
				throw new InsufficientBalanceException("your balance is 10,000 only!");
			}
			if(i <= 0)
			{
				System.out.println("Invalid do you wish to try again?? yes or no");
				String response = sc.next();
				
				if (!response.equalsIgnoreCase("yes"))
				{
					break;
				}
				else
				{
					continue;
				}
			}
		}
		while (true);
		System.out.println((double)i + " cash despensed. count the cash before leaving");
		System.out.println("Thank you");
	}
}
