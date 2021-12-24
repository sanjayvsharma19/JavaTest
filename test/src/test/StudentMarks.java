package test;
import java.util.Scanner;
public class StudentMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student marks");
		int Marks = sc.nextInt();
		if(Marks>=95){
		System.out.println("A+");
		}
		else if(Marks>=85){
		System.out.println("A");
		}
		else if(Marks>=80)
		{
		System.out.println("B+");
		}
		else if(Marks>=70)
		{
		System.out.println("B");
		}
		else if(Marks>=60)
		{
		System.out.println("C");
		}
		else if(Marks>=50) 
		{
		System.out.println("D");
		}
		else {
		System.out.println("Fail");
		}
		}
	}


