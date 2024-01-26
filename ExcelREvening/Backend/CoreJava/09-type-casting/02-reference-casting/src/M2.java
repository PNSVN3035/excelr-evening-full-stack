class M2 
{
	public static void main(String[] args) 
	{
		// these object refernces are not pointing to anywhere
		Object obj = null;
		A a1 = null;
		B b1 = null;
		C c1 = null;
		D d1 = null;
		System.out.println("obj: " + obj + ", " +"a1: " + a1 + ", " + 
						   "b1: " + b1 + ", " +"c1: " + c1 + ", " + 
						   "d1: " + d1);
		System.out.println("------------------------------------");
		/*earlier these references were pointing to null, now we are 
		re-initializing these reference variables with the corresponding 
		the objects*/
		obj = new Object();
		a1 = new A();
		b1 = new B();
		c1 = new C();
		d1 = new D();
		/*If we are trying to print the reference now we are going to get
		objects memory location. In the form of hashcode and in the form of
		hexa-decimal*/
		System.out.println("obj: " + obj + ", " +"a1: " + a1 + ", " + 
						   "b1: " + b1 + ", " +"c1: " + c1 + ", " + 
						   "d1: " + d1);
	}
}
