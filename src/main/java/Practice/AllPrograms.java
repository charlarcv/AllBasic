package Practice;
import java.util.Scanner;
public class AllPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		System.out.println("Sum of two numbers "+ a+b);
		AddOne();
	}
	
	public static  void AddOne() {
		Scanner sc=new Scanner(System.in);
		int Sum=0;
		for (int i = 0; i < 2; i++) {
			System.out.println("Inpunt the number: " );
			int d= sc.nextInt();
			Sum=Sum+d;
		}
		System.out.println(Sum);
		//int f= sc.nextInt();
		
		/*if(d%2==0) 
		{
			System.out.println("" );
		}*/
	}

}
