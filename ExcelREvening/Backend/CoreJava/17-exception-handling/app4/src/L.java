class L
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;//AE
		int j = Integer.parseInt("abc");//NFE
		String s1 = null;
		int k = s1.length();//NPE
		int[] l = new int[4];
		int m = l[4];//AIOBE
		Object obj = new L();
		String s = (String)obj;//CCE
		main(null);//SOE
		int[] n = new int[99999999];//OME
		String s2 = "hello";
		String s3 = s2.substring(5, 10);//SIOBE
		int[] p = new int[-10];//NASE
	}
}
