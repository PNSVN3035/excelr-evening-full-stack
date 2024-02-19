import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
class M21 
{
	@SuppressWarnings({"removal", "unchecked"})
	public static void main(String[] args) 
	{
		Integer[] array = {new Integer(10), new Integer(4), new Integer(1), new Integer(0), new Integer(30), new Integer(2)};

		//toString(T[] a): Returns a string representation of the contents of the specified array.
		System.out.println("intial order: " + Arrays.toString(array));
		//sort(T[] a): Sorts the specified array into ascending order, according to the natural ordering of its elements.

		Arrays.sort(array);

		System.out.println("\nascending order: " + Arrays.toString(array));


		Comparator ctr = Collections.reverseOrder();
		//sort(T[] a, Comparator<? super T> c): Sorts the specified array of objects into ascending order, according to the order induced by the specified comparator.

		Arrays.sort(array, ctr);

		System.out.println("\ndescending order: " + Arrays.toString(array));
	}
}

/*
System.out.println("\n -----------------------");

		int counter = 1;
		for (int i = 0; i < array.length; i++)
		{
			if (counter != array.length)
			{
				System.out.print(array[i] + ", ");
			}
			else if(counter == array.length)
			{
				System.out.print(array[i]);
			}
			counter++;
		}

		*/