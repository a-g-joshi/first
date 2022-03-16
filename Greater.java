package firstcdac;
 import java.util.Scanner;
public class Greater {

	int a;
	int b;
	
	void get()
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter first number");
		 a=i.nextInt();
		 Scanner j=new Scanner(System.in);
			System.out.println("Enter Second number");
			 b=j.nextInt();
		
		
	}
	
	
	
	void display()
	{
		if(a>b)
		{
			System.out.println("Greater number is  " +a);
			
		}
		else
		{
			System.out.println("Greater number is  " +b);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Greater k= new Greater();
     k.get();
     k.display();

}
}