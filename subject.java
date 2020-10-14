import java.util.Scanner;
public class subject {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,marks,sum=0,percent;
		for(i=1;i<=5;i++) {
			System.out.println("Enter Marks");
			marks=sc.nextInt();
			sum=sum+marks;
		}
		percent=sum/5;
		System.out.println("The Percentage is \n"+percent);
		if(percent>=85 && percent<=100)
		{
			System.out.println("Grade A");
		}
		else if(percent>=75 && percent<85)
		{
			System.out.println("Grade B");
		}
		else if(percent>=60 && percent<75)
		{
			System.out.println("Grade C");
		}
		else if(percent>=50 && percent<60)
		{
			System.out.println("Grade D");
		}
		else if(percent>=40 && percent<50)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
		
	}
}
