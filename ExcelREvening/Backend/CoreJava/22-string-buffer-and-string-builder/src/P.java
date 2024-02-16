class P
{
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("hellotoall");
		StringBuilder sb2 = new StringBuilder("hellotoall");
		System.out.println(sb1.capacity());
		System.out.println(sb1 == sb2);
		//A a1 = new A();
		//A a2 = new A();
		//B b1 = new B();
		//System.out.println(a1 == a2);
		//Integer i = new Integer(10);
		//Character ch = new Character('a');
		//System.out.println(i == ch);
	}
}
//class A
//{
//}
//class B
//{
//}
/*
 * every method of StringBuffer is available in the StringBuilder
 * StringBuffer is a synchronized and StringBuilder is not synchronized
 * StringBuffer - equals, hashcode not overrided
   we cant compare two strings based on the content bcz of this
 * String is implementing Comparable interface, but not stringbuffer
 * bcz of Comparable we can achieve sorting based on the content
 * bcz StringBuffer not implementing comparable we cant sort two
   stringbuffer objects based on the content
 * we can create a string object without a new operator but we cant in 
   StringBuffer
 * + operator only overloaded with String but not wrt StringBuffer
 * String we use concat in StringBuffer we use append method
 * inside String there is no reverse method but in SB we have
 * in String class delete method not there but in SB we have
 * in case of String class there is no concept of capacity its one time object
 * similarity both are used for managing multiple characters
    toString method got override in both
    both the classes are implementing serializable interface.
 * serialization is the concept of file handling 
 * */
