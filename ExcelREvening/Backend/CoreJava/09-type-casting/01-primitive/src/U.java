class U 
{
	public static void main(String[] args) 
	{
		double d = 10.0;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println("d: " + d + ", " + "f: "  + f + ", " +
						   "l: " + l + ", " + "i: "  + i + ", " +
			   			   "s: " + s + ", " + "b: "  + b);
	}
}
