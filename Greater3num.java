package firstcdac;
import java.util.Scanner;
public class Greater3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x;
       int y;
       int z;
       
       System.out.println("Enter three numbers you want to check");
       Scanner f=new Scanner(System.in);
       x=f.nextInt();
       y=f.nextInt();
       z=f.nextInt();
       
       if(x>y && x>z)
       {
    	   System.out.println("the greater number is   "+x);
       }
       else if(y>x && y>z)
       {
    	   System.out.println("the greater number is  "+y);
       }
       else
       {
    	   System.out.println("the greater number is  "+z);
       }
	}

}
