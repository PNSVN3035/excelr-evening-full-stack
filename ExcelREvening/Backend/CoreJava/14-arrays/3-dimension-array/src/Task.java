class Task 
{
	public static void main(String[] args) 
	{
		int[][][] a = {{{1,2,3},{3,4,5},{5,6,7}}};
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				for(int k = 0; k < a[0][0].length; k++)
				{
					System.out.println("a[" + i + "][" + j + "][" + k +
						"] = " + a[i][j][k]);
				}
			}
		}
	}
}
