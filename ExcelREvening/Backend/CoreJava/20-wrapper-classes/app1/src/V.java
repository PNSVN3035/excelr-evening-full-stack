class V
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		char value = 'b';

		Character c1 = Character.valueOf(value);//new Character(value);
		char c2 = c1.charValue();

		System.out.println(c2);
		System.out.println("done");
	}
}