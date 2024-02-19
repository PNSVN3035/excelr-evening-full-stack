import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class M20
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();

		list.add(0);
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(10);
		System.out.println("intial list before sort: " + list);

		//Comparator ctr = Collections.reverseOrder();
		//reverseOrder(): Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.

		Collections.sort(list, Collections.reverseOrder());

		System.out.println("final list after reverse sort: " + list);
	}
}
/*

The Collections class in Java provides utility methods for working with collections. Here is a list of commonly used methods in the Collections class:

binarySearch(List<? extends Comparable<? super T>> list, T key): Searches the specified list for the specified object using the binary search algorithm.
binarySearch(List<? extends T> list, T key, Comparator<? super T> c): Searches the specified list for the specified object using the binary search algorithm.
copy(List<? super T> dest, List<? extends T> src): Copies all of the elements from one list into another.
fill(List<? super T> list, T obj): Replaces all of the elements of the specified list with the specified element.
max(Collection<? extends T> coll): Returns the maximum element of the given collection, according to the natural ordering of its elements.
max(Collection<? extends T> coll, Comparator<? super T> comp): Returns the maximum element of the given collection, according to the order induced by the specified comparator.
min(Collection<? extends T> coll): Returns the minimum element of the given collection, according to the natural ordering of its elements.
min(Collection<? extends T> coll, Comparator<? super T> comp): Returns the minimum element of the given collection, according to the order induced by the specified comparator.
nCopies(int n, T o): Returns an immutable list consisting of n copies of the specified object.
reverse(List<?> list): Reverses the order of the elements in the specified list.
reverseOrder(): Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.
shuffle(List<?> list): Randomly permutes the specified list using a default source of randomness.
shuffle(List<?> list, Random rnd): Randomly permutes the specified list using the specified source of randomness.
singleton(T o): Returns an immutable set containing only the specified object.
singletonList(T o): Returns an immutable list containing only the specified object.
singletonMap(K key, V value): Returns an immutable map containing only the specified mapping.
sort(List<T> list): Sorts the specified list into ascending order, according to the natural ordering of its elements.
sort(List<T> list, Comparator<? super T> c): Sorts the specified list according to the order induced by the specified comparator.
swap(List<?> list, int i, int j): Swaps the elements at the specified positions in the specified list.
unmodifiableCollection(Collection<? extends T> c): Returns an unmodifiable view of the specified collection.
unmodifiableList(List<? extends T> list): Returns an unmodifiable view of the specified list.
unmodifiableMap(Map<? extends K,? extends V> m): Returns an unmodifiable view of the specified map.
unmodifiableSet(Set<? extends T> s): Returns an unmodifiable view of the specified set.
unmodifiableSortedMap(SortedMap<K,? extends V> m): Returns an unmodifiable view of the specified sorted map.
unmodifiableSortedSet(SortedSet<T> s): Returns an unmodifiable view of the specified sorted set.
*/