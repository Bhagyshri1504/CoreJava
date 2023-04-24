public class ForSumOfEvenOdd
{
	public static void main(String args[])
	{
		int i,o=0,e=0,odd=0,even=0;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is Even");
				e++;
				even=even+i;
			}
			else
			{
				System.out.println(i+" is Odd");
				o++;
				odd=odd+i;
			}
		}
		System.out.println("Total Even Number:"+e);
		System.out.println("Total Odd Number:"+o);
		System.out.println("Total  of Even Number:"+even);
		System.out.println("Total  of odd Number:"+odd);
		System.out.println("Total of all Numbers are:"+(even+odd));
	}
}