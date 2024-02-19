//Queue
import java.util.LinkedList;

public class M1
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(990);
		list.add(190);
		list.add(290);
		list.add(80);
		list.add(790);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.removeFirst());
		System.out.println(list);
	}
}
/*
1. LinkedList is supporting basic queue.
2. Queue FIFO
*/

/*
Data Structure:

- ArrayList is internally backed by an array, which provides indexed access to elements.
- LinkedList is internally implemented as a doubly linked list, where each element is stored in a separate node and connected to the previous and next nodes.

Performance:
 - If there is a frequent reading operation is there then you could use ArrayList
 - Adding and removing elements in ArrayList at the beginning or middle of the list requires shifting subsequent elements, which can be slow for large lists.

- ArrayList provides faster access time for random access (get and set) because it uses array indexing, which has constant time complexity O(1).

- If there is a frequent add and remove operations are there then you could use LinkedList
- Adding and removing elements in LinkedList at the beginning or middle of the list is faster because it only requires adjusting pointers.

- LinkedList provides faster insertion and deletion time (add and remove operations) for elements in the middle of the list because it only requires adjusting the pointers, but accessing elements by index has linear time complexity O(n) because it requires traversing the list from the beginning or end to find the desired element.

Search Operation:

- ArrayList performs better in search operations when the index of the element is known, as it can directly access elements using array indexing.

- LinkedList performs better in search operations when scanning the list sequentially because it doesn't need to jump to specific indices.

Implementation Complexity:

- ArrayList has a simpler implementation compared to LinkedList.
- LinkedList has a more complex implementation due to managing nodes and pointers.
*/


