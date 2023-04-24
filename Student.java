public class Student
{
	public static void main(String args[])
	{
		String name="Bhagyashri";
		int age = 21;
		char gender='F';
		float marks=7460;

		System.out.println("Student Name= "+name);
		System.out.println("Student age= "+age);
		System.out.println("Student Gender= "+gender);
		System.out.println("Student Marks= "+marks);

		System.out.println("Name= "+name+"Age= "+age+"Gender= "+gender+"Marks= "+marks);

		System.out.printf("Name=%s Age=%d Gender=%c Salary=%f",name,age,gender,marks);
	}
}