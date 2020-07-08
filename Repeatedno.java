class Repeatedno
{
	public static void main(String args[])
	{
		int n[] = {1,2,3,1,2,3,4};
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<=6;j++)
		{
			if(n[i]==n[j])
			{
				System.out.println(n[j]);
				break;
			}
         }
		}
	}
}