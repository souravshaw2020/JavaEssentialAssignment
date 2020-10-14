import java.util.Scanner;
public class avenger {
	Scanner sc = new Scanner(System.in);
	String name,weapon,planet;
	int age,power;
	public void getDetails()
	{
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the power");
		power=sc.nextInt();
		System.out.println("Enter the weapon");
		weapon=sc.nextLine();
		System.out.println("Enter the planet");
		planet=sc.nextLine();
	}
	public void displayDetails()
	{
		System.out.println("The name is "+name+"\n"+" The age is "+age+"\n"+"The power is "+power+"\n"+"The weapon is "+weapon+"\n"+"The planet is "+planet);
	}
	public static void main(String args[])
	{
		avenger[] ob = new avenger[5];
		int i;
		for(i=0;i<5;i++)
		{
			ob[i]=new avenger();
			ob[i].getDetails();
		}
		for(i=0;i<5;i++)
		{
			ob[i].displayDetails();
		}
	}
}
