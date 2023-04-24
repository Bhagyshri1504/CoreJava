public class ForLoop
{
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("1st");
		for(i=5;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("2nd");
		i=1;
		for(;i<=5;)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("3rd");
	}
}