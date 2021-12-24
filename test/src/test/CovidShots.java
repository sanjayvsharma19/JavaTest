package test;
import java.util.*;

public class CovidShots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int age = sc.nextInt();
		if(age>=61){
		System.out.println("Eligible now");
		}
		else if(age>=45){
		System.out.println("Eligible in 15 days");
		}
		else if(age>18)
		{
		System.out.println("Eligible in a month");
		}
		else if(age<18) {
		System.out.println("Not Eligibele");
		}
		else {
		System.out.println("vaccianation");
		}
		}
		}
