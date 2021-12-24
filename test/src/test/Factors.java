package test;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	{
		
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number ");
		 int number = sc.nextInt();

		    System.out.print("Factors of " + number + " are: ");

		 
		    for (int i = 1; i <= number; ++i) {

		      // if number is divided by i
		      // i is the factor
		      if (number % i == 0) {
		        System.out.print(i + " ");
		      }
		    }
	}
	}
}
	  

