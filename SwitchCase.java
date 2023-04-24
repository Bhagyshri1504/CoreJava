public class SwitchCase
{
	public static void main(String args[])
	{
		int num1=10,num2=5,res=0;
		char choice='+';
		switch(choice)
		{
			case '+': 
			            res=num1+num2;
			            break;
			case '-': 
			            res=num1-num2;
			            break;
			case '*': 
			            res=num1*num2;
			            break;
			case '/': 
			            res=num1/num2;
			            break;
			default:
			            System.out.println("Invalid Operation....Try Again!!");

		}
		System.out.println("Result="+res);
	}
}