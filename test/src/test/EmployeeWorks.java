package test;

import java.util.Scanner;



public class EmployeeWorks {



public static void main(String a[] ){
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of hours you worked : ");
int hour=s.nextInt();
if(hour>=8) {
System.out.print("Payment for "+hour+" hours of work is Rs."+(250*hour));
}
else {
System.out.println("Payment for "+hour+" hours of work is Rs."+(250*8));
System.out.println("No payment for over time");
}
}
}