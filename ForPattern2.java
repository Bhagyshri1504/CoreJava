public class ForPattern2
{
	public static void main(String args[])
	{
		int i,j,num=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}