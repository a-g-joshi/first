package firstcdac;
import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter the number");
		Scanner a= new Scanner(System.in);
		i=a.nextInt();
		 if(i % 2 == 0)
		 {
			 System.out.println("the number is even");
		 }
		 else
		 {
			 System.out.println("the number is odd");
		 }

	}

}
