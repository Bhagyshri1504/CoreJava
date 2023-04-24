public class NestedIf
{
	public static void main(String args[])
	{
		int age=13;
		String country="Pakistan";
		if(age>=18)
		{
			if(country=="India"||country=="india")
			{
				System.out.println("Valid Voter");
			}
			else
			{
				System.out.println("Invalid voter because voter's Country is not India");
			}
		}
		else
		{
			System.out.println("Invalid voter because the voter is minor in Age.");
		}
	}
}
