import java.util.ArrayList;
import java.util.Scanner;
class M16 
{
	@SuppressWarnings("unchecked")	
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("add an element to the list");
			String str = sc.next(); //read the next token

			if (!list.contains(str))
			{
				list.add(str);
				System.out.println("successfuly added: " + str);
				System.out.println("updated list: " + list);
			}
			else
			{
				System.out.println("Sorry, that element is already available!");
			}
			System.out.println("do you wish to add element to the ArrayList??");
		}
		while ("y".equalsIgnoreCase(sc.next()));  //read next token. "y" is lower case or upper case. Doesn't matter. That's what I am using equals.IgnoreCase();

		System.out.println("final list: " + list);
	}
}
