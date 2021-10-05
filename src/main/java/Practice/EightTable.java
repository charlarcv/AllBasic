package Practice;

import java.io.InputStream;
import java.util.Scanner;

public class EightTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to get table: ");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		for (int i = 1; i < 11; i++) {
			int f=d*i;
			System.out.println(d +" * " + i + " = " + f);
		}
		
		EightTable e=new EightTable();
		e.StoreInput();
		
	}
	public void StoreInput() {
		System.out.println("How many nummmbers you want to enter ");
		Scanner d=new Scanner(System.in);
		int e=d.nextInt();
		int[] f = null;
		for (int i = 0; i < e; i++) {
			f=new int[e];
			Scanner sc=new Scanner(System.in);
			int h=sc.nextInt();
			f[i]= h;
			
		}

        for (int element: f) {
            System.out.println(element);
        }
	}
}
