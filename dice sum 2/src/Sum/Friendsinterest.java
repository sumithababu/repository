package Sum;
import java.util.Scanner;
public class Friendsinterest 
{
	public static void main(String[] args)
	{
	Scanner sc1 = new Scanner(System.in);
	int rate,threshold;
	double interest;
	double deposit;

	System.out.println( "enter the rate value");
	rate = sc1.nextInt();
	
	System.out.println("enter the threshold value");
	threshold = sc1.nextInt();

	System.out.println("enter the deposit value");
	deposit = sc1.nextDouble();
	 int year = 0;
	interest = 0;
	while(deposit<threshold)
	{
	interest=deposit*(rate/100);
	   deposit=deposit+interest;
	   year++;
	}
	   System.out.println("the number of years is"+ year);
	
	}
	
	}
	 
	
	
	
	

	

