package NEWPROGRAMS;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	{
		//if(year%4==0&&year%400==0&&year%100==0)
		if((year%400==0)||(year%4==0&&year%100!=0))
		System.out.println("leapyear");
		else
	    System.out.println("not a leapyear");
	}
	}

}
