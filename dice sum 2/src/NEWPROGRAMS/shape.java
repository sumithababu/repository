package NEWPROGRAMS;

public  abstract class shape {
	int a =10;
	// we can define constructor
	shape(){
		System.out.println("inside shape constructor");
	}
	//abstract method
       abstract void draw();
       public void m1() {
    	   System.out.println("m1 method");
       }
}
