package NEWPROGRAMS;

public class Student {
 private int rollno;//how to access this bcz its private for this u r using getter and setter methods
 private String name;
 
 /*student and test claases are co related.
 
 
 /*public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}




public int getRollno() {
	return rollno;
}




public void setRollno(int rollno) {
	this.rollno = rollno;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}
*/
//cntrl+back slash for full comments//

Student(int rollno,String name)
{
	 this.rollno=rollno;
	 this.name =name;
	 System.out.println("inside student constructor");
 }
 public void setrollno(int rollno) {
	 this.rollno = rollno;
 }
public int getrollno()
{
	 return this.rollno;
 }
 public static void main(String[] args)
 {
	 Student s = new Student(10,"sri");
	 s.getrollno();
	 System.out.println(s.name);
	 System.out.println(s.rollno);
	 
 }
}

