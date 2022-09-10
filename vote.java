import java.util.Scanner;
class vote {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter your age");
		int age = scan.nextInt();
		if(age>=18)
		{
			System.out.println("You can Vote");
		}
		else
		{
			System.out.println("Sorry,You cannot vote " );
		}

	}

}