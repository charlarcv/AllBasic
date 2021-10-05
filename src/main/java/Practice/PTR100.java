package Practice;

import java.util.Scanner;

public class PTR100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input Principle Amount: ");
		Scanner sc=new Scanner(System.in);
		float PrincipleAmount=sc.nextFloat();
		System.out.println("Input TimeInMonth: ");
		int TimeInMonth=sc.nextInt();
		System.out.println("Input Interest: ");
		float Interest=sc.nextFloat();
		PTR100 h=new PTR100();
		float ss=h.Cal(PrincipleAmount, TimeInMonth, Interest);
		System.out.println("Interest is "+ ss);
		float gg=ss+PrincipleAmount;
		System.out.println("Total Amount is " + gg);
		
	}
	public float Cal(float s, int d, float f){
		float g = (s*d*f/100);
		
		return g;
	}
}
