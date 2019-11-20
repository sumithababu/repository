package NEWPROGRAMS;

public class Main {
public static void main(String[] args) {
	Sumi s = new Abi();
	s.draw();
	s.getArea();
	Sumi d = new remya();
	d.getArea();
	Sumi.displaycolor();//static methods can be accessd using class names.
	s.applycolor();// default can be accessed using object name
}
}
