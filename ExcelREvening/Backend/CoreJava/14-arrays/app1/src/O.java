import java.util.Arrays;
class Employee
{
}

public class O
{
	public static void main(String[] args)
	{
		Employee[] emp = new Employee[2];
		String s1 = "abc", s2[] = new String[4], s3 = "xyz";
		System.out.println(s1 + ", " + s3 + ", " + s2[0]);
		System.out.println(emp[0] + ", " + emp[1]);
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(emp));

	}
}
