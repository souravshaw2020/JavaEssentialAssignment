import java.util.Scanner;
public class sum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int i,sum=0;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum is "+sum);
	}
}
