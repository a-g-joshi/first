package firstcdac;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int marks;
       System.out.println("Enter the marks");
       Scanner a=new Scanner(System.in);
       marks=a.nextInt();
       
       if(marks>80)
       {
    	   System.out.println("Student  got A grade");
       }
       else if(marks>=60)
       {
    	   System.out.println("Student  got B grade");
       }
       else if(marks>=50)
       {
    	   System.out.println("Student  got C grade");
       }
       else if(marks>=45)
       {
    	   System.out.println("Student  got D grade");
       }
       else if(marks>=25)
       {
    	   System.out.println("Student  got E grade");
       }
       else
       {
    	   System.out.println("Student  got F grade");
       }
	}

}
