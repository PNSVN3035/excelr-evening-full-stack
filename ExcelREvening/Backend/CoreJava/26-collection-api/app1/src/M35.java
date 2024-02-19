import java.util.ArrayList;
import java.util.ListIterator;
class M35
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println(list);
		System.out.println("--------------");

		ListIterator listIterator = list.listIterator();

		while (listIterator.hasNext())
		{
			System.out.println(listIterator.next() + ", ");
		}
	}
}

/*
ListIterator in Java is an interface that extends Iterator and provides additional functionality for iterating over lists bidirectionally, as well as for modifying the list during iteration. Here's a list of methods available in the ListIterator interface:

totally 9 methods we have

void add(E e): Inserts the specified element into the list (optional operation).

boolean hasNext(): Returns true if there are more elements in the list when traversing it forward.

boolean hasPrevious(): Returns true if there are more elements in the list when traversing it backward.

E next(): Returns the next element in the list and advances the cursor position.

int nextIndex(): Returns the index of the element that would be returned by the next call to next().

E previous(): Returns the previous element in the list and moves the cursor position backward.

int previousIndex(): Returns the index of the element that would be returned by the next call to previous().

void remove(): Removes from the list the last element that was returned by next() or previous() (optional operation).

void set(E e): Replaces the last element returned by next() or previous() with the specified element (optional operation).
*/