package NEWPROGRAMS;
import java.util.Scanner;
public class fibbonaci {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int number,i;
	System.out.println("enter the number ");
	number = sc.nextInt();
	int first=0,second=1,third;
	System.out.print(first+" " +second+ " ");
	
		for(i=0;i<number;i++)
		{
	 third=first+second;
	 first=second;
	 second= third;
	 System.out.print(third+" ");
	}
	
}
}
