import java.util.ArrayList;
import java.util.ListIterator;

public class M43
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		
		ListIterator it = list.listIterator();
		
		it.add(50);//ListIterator has add(E e) method unlike Iterator Interface.
		
		while(it.hasNext())
		{
			if(it.nextIndex() == 2)
			{
				it.add(100);
			}
			System.out.println("In the index: " + it.nextIndex() + " The element: " + it.next() + " is present");
		}

		it.add(50);

		System.out.println();

		while(it.hasPrevious())
		{
			System.out.println("In the index: " + it.previousIndex() + " The element: " + it.previous() + " is present");
		}

		System.out.println(list);
		System.out.println("--------------");

		while(it.hasNext())
		{
			System.out.println("In the index: " + it.nextIndex() + " The element: " + it.next() + " is present");
		}
	}
}