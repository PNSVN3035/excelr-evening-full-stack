import java.util.ArrayList;
import java.util.ListIterator;

public class M41
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		ListIterator lit = list.listIterator();
		
		lit.add(50);//to avoid CuncurrentModificationException //use 
		
		System.out.println(list);
		System.out.println("--------");
		System.out.println(list.size());// total no of element
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}

		System.out.println("forward direction");
		
		while(lit.hasNext())
		{
			System.out.println("In the index: " + lit.nextIndex() + " The element: " + lit.next() + " is present");
		}

		System.out.println(list);
		System.out.println("--------");
		System.out.println(list.size());// total no of element
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}

		System.out.println("backward direction");

		while(lit.hasPrevious())
		{
			System.out.println("In the index: " + lit.previousIndex() + " The element: " + lit.previous() + " is present");
		}
	}
}
