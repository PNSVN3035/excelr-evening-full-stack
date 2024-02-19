import java.util.ArrayList;
import java.util.Iterator;
class M33 
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

		//iterator(): Returns an iterator over the elements in this list in proper sequence.
		Iterator iterator = list.iterator();

		while (iterator.hasNext())
		{
			System.out.println(iterator.next() + ", ");//reading
			iterator.remove(); //Object obj = (Integer) //just removing 
			//System.out.println(obj);
		}
		System.out.println(list);
	}
}
/*
methods:

boolean hasNext(): Returns true if there are more elements in the collection when traversing it forward.

E next(): Returns the next element in the collection and advances the cursor position.

void remove(): Removes from the underlying collection the last element returned by next() (optional operation).


An Iterator is an interface that provides a way to traverse through the elements of a collection(such as list)

hasNext() - to check if there are more elements

Iterator interface in Java provides methods for iterating over a collection of objects. Here are the methods defined in the Iterator interface:

boolean hasNext(): Returns true if the iteration has more elements.
E next(): Returns the next element in the iteration.
void remove(): Removes from the underlying collection the last element returned by this iterator (optional operation).
default void forEachRemaining(Consumer<? super E> action): Performs the given action for each remaining element until all elements have been processed or the action throws an exception.
*/