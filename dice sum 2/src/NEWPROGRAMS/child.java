package NEWPROGRAMS;

public class child extends parent {
	void m3(){
		System.out.println("m3 method");
	}
   void m4() {
	   System.out.println("m4 method");
   }
  public void m1() {
	   System.out.println("child class m1 method");
   }
   public static void main(String[] args)
   {
	   child c = new child();
	   c.m1();
	   c.m2();
	   c.m3();
	   c.m4();
   }
}
