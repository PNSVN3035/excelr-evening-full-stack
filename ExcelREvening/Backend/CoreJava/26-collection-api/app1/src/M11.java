import java.util.ArrayList;
public class M11
{
	@SuppressWarnings({"unchecked", "removal"})
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		//clear(): Removes all of the elements from this list.
		list.clear();//remove all list element
		//if list is empty return true
		System.out.println(list);
		//isEmpty(): Returns true if this list contains no elements.
		System.out.println(list.isEmpty());	
	}
}


