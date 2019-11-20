package NEWPROGRAMS;

public class block {
int x = 10;
int y = 20;
int z;//instance variable
static String name;//static variable
static
{
	name ="ramesh";// can use static variable.
                      	//sytem.out.println(x);//u cant use instance variable cant access bcz we r inside ststic
	System.out.println("inside static block");
}//to check The working of static block
	{
		z=100;
		System.out.println("inside instance block");
	}
public static void main(String[] args) {
	System.out.println("inside main method");
  block b = new block();// using this instance block and constructor block will be executed.
  System.out.println(b.z);
}
}
