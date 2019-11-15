package Sum;
import java.util.Scanner;
public class Friendsinterest 
{
	public static void main(String[] args)
	{
	
	int rate,threshold;
	
	double deposit;
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter the deposit value");
	deposit = sc1.nextDouble();

   System.out.println( "enter the rate value");
	rate = sc1.nextInt();
	
	System.out.println("enter the threshold value");
	threshold = sc1.nextInt();
	
	int year=0;
	while(deposit<threshold)
	{
	double interest=((deposit/100)*rate);
	   deposit=deposit+interest;
	   year++;                                                                                  
	}
	   System.out.println("the number of years is"+ year);
	
	}
	
	}
	 
	
	
	
	

	

