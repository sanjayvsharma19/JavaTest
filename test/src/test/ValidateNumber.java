package test;

import java.util.*;
public class ValidateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // take input from users
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter your number: ");
	    double marks = input.nextDouble();

	    // ternary operator checks if
	    // marks is greater than 40
	    String result = (marks > 100) ? "Its greater than 100" : "its lesser than 100";

	    System.out.println("number " + result );
	    input.close();
	}

}
