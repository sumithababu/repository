package Sum;

import java.util.Scanner;

public class Dice {
	public static void main(String args[])
	{
	Scanner sc1= new Scanner(System.in);
	int integer1=sc1.nextInt();
	int integer2=sc1.nextInt();
	
	if(integer1==integer2)
	{
		
		integer1= integer1+integer2;
	System.out.println("the points scored is"+2*integer1);
		
	} 
	else if(integer1>=0&&integer1<=6&&integer2>=0&&integer2<=6)
	{
		integer1= integer1+integer2;
	
		System.out.println("the points scored is"+ integer1);
	}
	else
	{
		System.out.println("the input is invalid");
	
	}

}
}
