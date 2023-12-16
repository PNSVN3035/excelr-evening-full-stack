import java.util.Scanner;
class Facebook 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Facebook! Please register");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name");
		String firstName = sc.next();
		
		System.out.println("Enter your Surname");
		String surName = sc.next();

		System.out.println("Enter your Mobile Number");
		long mobileNumber = sc.nextLong();

		System.out.println("Enter your Email ID");
		String emailId = sc.next();

		System.out.println("Enter your Password");
		String newPassWord = sc.next();

		System.out.println("Enter your DOB");
		String dateOfBirth = sc.next();

		System.out.println("Enter your Gender");
		String gender = sc.next();

		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();

		System.out.println("Enter your First Initials");
		String firstInitial = sc.next(); /*here we are entered initial then 
		 after will press enter... 1*/

		System.out.println("Enter your Favorite Qoute");
		sc.nextLine(); /*1... the entered character will be 
		consumed by this "nextLine"*/
		String qoute = sc.nextLine(); /*that is why i am added another 
		nextLine()*/

		System.out.println("Are you Alive?");
		boolean status = sc.nextBoolean();

		System.out.println("\n___________________________________\nYour details are listed below\n"+ 
		"First Name: " + firstName + "\n" + 
		"Surname: " + surName + "\n" + 
		"Mobile Number : " + mobileNumber + "\n" +
		"Email ID : " + emailId + "\n" +
		"Password : " + newPassWord + "\n" +
		"DOB: " + dateOfBirth + "\n" +
		"Gender : " + gender + "\n" +
		"Salary : " + salary + "\n" +
		"First Initials : " + firstInitial + "\n" +
		"Favorite Qoute : " + qoute + "\n" + 
		"Are you Alive?: " + status);

		sc.close();
	}
}
