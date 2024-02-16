class M7 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Integer obj1 = 100;
		Integer obj2 = new Integer(100);
		Character obj3 = 'a';
		Character obj4 = new Character('a');
		Boolean obj5 = true;
		Boolean obj6 = new Boolean(false);
		Double obj7 = 10.0;
		Double obj8 = new Double(10.0);
		Float obj9 = 20.0f;
		Float obj10 = new Float(20.0f);
		Byte obj11 = 20;
		Byte obj12 = new Byte((byte)20);
		Short obj13 = 30;
		Short obj14 = new Short((short)30);
		Long obj15 = 40l;
		Long obj16 = new Long(40l);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		System.out.println(obj7.hashCode());
		System.out.println(obj8.hashCode());
		System.out.println(obj9.hashCode());
		System.out.println(obj10.hashCode());
		System.out.println(obj11.hashCode());
		System.out.println(obj12.hashCode());
		System.out.println(obj13.hashCode());
		System.out.println(obj14.hashCode());
		System.out.println(obj15.hashCode());
		System.out.println(obj16.hashCode());
	}
}
/*
in every
wrapper class hashcode method got overrided and returning same
value not an address. in String, Wrapper, Collection classes
toString(), equals(), hashcode() overrided. in StringBuffer and 
StringBuilder class only toString() got overrided not the
hashCode() and equals().
*/