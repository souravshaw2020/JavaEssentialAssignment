public class employee {
	String name="Saurab",city="chennai";
	int age=23;
void display()
{
	System.out.println("The name is "+name);
	System.out.println("The age is "+age);
	System.out.println("The city is "+city);
}
public static void main(String args[])
{
	employee ob = new employee();
	ob.display();
	employee ob1 = new employee();
	ob1.display();
}
}
