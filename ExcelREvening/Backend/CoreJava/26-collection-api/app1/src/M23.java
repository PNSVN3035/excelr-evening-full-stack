import java.util.ArrayList;
import java.util.Collections;
class M23 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("Z");
		list.add("#");
		list.add("G");
		list.add("10");
		list.add("1");
		list.add("P");
		list.add("D");
		list.add("*");
		list.add("a");
		list.add("k");
		list.add("e");
		list.add("j");
		System.out.println("Before sort: " + list);
		//Special characters, Numbers, Upper case Characters, Lower case Characters ==> sorted
		//Based on ASCII values
		Collections.sort(list);
		System.out.println("After sort: " + list);
	}
}
/*
 corresponding ASCII values for each of these elements:

#: ASCII value = 35
*: ASCII value = 42
1: ASCII value = 49
10: There are two characters here, '1' and '0'. Their ASCII values are 49 and 48 respectively.
D: ASCII value = 68
G: ASCII value = 71
P: ASCII value = 80
Z: ASCII value = 90
a: ASCII value = 97
e: ASCII value = 101
j: ASCII value = 106
k: ASCII value = 107
*/