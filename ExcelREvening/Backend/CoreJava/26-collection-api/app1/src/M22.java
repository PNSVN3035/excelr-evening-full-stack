import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class M22
{
	public static void main(String[] args) 
	{
		String[] array = {"B", "A", "E", "D", "C"};

		System.out.println("intial list before sort: " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("after sorting: " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());
		
		//for (int i = 0; i < array.length; i++)
		//{
		//	System.out.print(array[i] + ", ");
		//}

		System.out.println("after reversing: " + Arrays.toString(array));
	}
}
