public class SwitchWithStrDt
{
	public static void main(String args[])
	{
		String dept="Sales";
		switch(dept)
		{
			case "Sales":
				  System.out.println("Employee will get 50% increment");

			case "Account":
				       System.out.println("Employee will get 30% increment");

			case "Finance":
				      System.out.println("Employee will get 20% increment");

			default:
			            System.out.println("Sorry!!...No Increment Done");
		}
	}
}