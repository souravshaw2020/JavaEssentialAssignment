import java.util.Scanner;
public class odd {
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The odd values are");
		for(i=0;i<5;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
