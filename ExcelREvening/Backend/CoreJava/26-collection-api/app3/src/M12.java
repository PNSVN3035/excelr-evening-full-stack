import java.util.LinkedHashSet;
class M12 
{
	public static void main(String[] args) 
	{
		//in case of LinkedList order is preserved
		LinkedHashSet set = new LinkedHashSet();
		set.add(90);
		set.add(92);
		set.add(93);
		set.add(90);
		set.add(900);
		set.add(800);
		set.add(800);
		set.add(80);
		set.add(660);
		set.add(76);
		set.add(98);
		//avoiding duplicates and maintaining order of addition.
		System.out.println(set);
	}
}
/*
No, in Java, the Set interface does not provide methods to access elements by index. Sets are collections that do not allow duplicate elements, and they do not guarantee the order of elements. Therefore, it doesn't make sense to access elements in a Set by index because there is no defined order of elements in a Set.
*/