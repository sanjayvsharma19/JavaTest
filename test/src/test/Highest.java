package test;

public class Highest {
	// Recursive function to return gcd of a and b
	static int gcd(int a, int b)
	{
		// Everything divides 0
		if (a == 0)
		return b;
		if (b == 0)
		return a;
	
		// base case
		if (a == b)
			return a;
	
		// a is greater
		if (a > b)
			return gcd(a-b, b);
		return gcd(a, b-a);
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int a = 14, b = 42;
		System.out.println("HCF of " + a +" and " + b + " is " + gcd(a, b));
		
	    System.out.print("Factors of " + gcd(a, b) + " are: ");

		 
	    for (int i = 1; i <= gcd(a, b); ++i) {

	      // if number is divided by i
	      // i is the factor
	      if (gcd(a, b) % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	      System.out.println();
	    System.out.print("Factors of " + b + " are: ");

		 
	    for (int i = 1; i <= b; ++i) {

	      // if number is divided by i
	      // i is the factor
	      if (b % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	    
	}
}

