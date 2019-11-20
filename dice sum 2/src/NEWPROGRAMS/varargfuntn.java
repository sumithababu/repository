package NEWPROGRAMS;
//i tried this for my sake.
public class varargfuntn 
{
	public static void main(String[] args)
	{
		jump(1,2,3,4,5,6,7);
	}
public static void jump(long... a)
{
	int add=0;
	for(long i:a) 

		add+=i;

		System.out.println("the sum is"+add);
}
}
//proper program from sir to print the numbers using vararg

/*static int sum;
public static void main(String[] args)

{
	add(1,2,3,4);
}
static void add(int...a)
{
 for(int i:a) {
	 
	 System.out.println(i);
 }
}
}*/