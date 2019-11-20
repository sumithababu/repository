package NEWPROGRAMS;

public class circle extends shape {
	public static void main(String[] args)
	{
		circle c =new circle ();
		//wenevr u create a instance thye constructor in abstrct clasis gng to get executed
		//shape c = new shape();// u cant create instance for absrtrct class so making as comment.
		c.draw();
		c.m1();
	}
@Override
void draw()
{
	System.out.println("circle");
}
}
