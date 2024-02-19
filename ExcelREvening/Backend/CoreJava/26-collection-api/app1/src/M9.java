import java.util.ArrayList;

class M9
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(90);
		list.add("abc");
		list.add(90.9);
		list.add(true);
		System.out.println(list);
		list.set(2, 'a');
		System.out.println(list);
	}
}

/*
 list of commonly used methods of the ArrayList class in Java:

add(E element): Appends the specified element to the end of this list.
add(int index, E element): Inserts the specified element at the specified position in this list.
addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list at the specified position.
clear(): Removes all of the elements from this list.
clone(): Returns a shallow copy of this ArrayList instance.
contains(Object o): Returns true if this list contains the specified element.
ensureCapacity(int minCapacity): Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
get(int index): Returns the element at the specified position in this list.
indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
isEmpty(): Returns true if this list contains no elements.
iterator(): Returns an iterator over the elements in this list in proper sequence.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
remove(int index): Removes the element at the specified position in this list.
remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
removeAll(Collection<?> c): Removes from this list all of its elements that are contained in the specified collection.
removeIf(Predicate<? super E> filter): Removes all of the elements of this collection that satisfy the given predicate.
retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
set(int index, E element): Replaces the element at the specified position in this list with the specified element.
size(): Returns the number of elements in this list.
spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this list.
subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
toArray(): Returns an array containing all of the elements in this list in proper sequence.
toArray(T[] a): Returns an array containing all of the elements in this list in the proper order; the runtime type of the returned array is that of the specified array.
*/
