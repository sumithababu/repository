package NEWPROGRAMS;
import java.util.Scanner;
public class Patternprinting {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int i,j,n=0;
	n=sc.nextInt();
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
	}
	System.out.println(" ");
}
}
}