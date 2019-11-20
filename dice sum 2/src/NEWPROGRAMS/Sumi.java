package NEWPROGRAMS;

public interface Sumi {
int x =10;
// DECLARING  IN THE INTERFACE
void draw();//UNIMPLEMENTED METHODS
void getArea();
//void setArea();
//void fillColor();

default void applycolor() {
	

	System.out.println("color applied");
}
static void displaycolor() {
	System.out.println("color displayed");
}
}