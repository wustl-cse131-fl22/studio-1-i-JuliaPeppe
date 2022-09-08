package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a first number to find an average");
		int n1 = in.nextInt();
		System.out.print("Please enter a second number to average with your first number");
		int n2 = in.nextInt();
		double average = (n1 + n2)/2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average + ".");
		

	}
}
