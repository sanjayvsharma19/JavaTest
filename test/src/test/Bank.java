package test;

import java.util.Scanner;

public class Bank {
	public static void dispense(int money)
	{
	int[] notes = new int[]{ 500,200,100,50,20,10,5,2,1};
	int[] notecount = new int[9];




	for (int i = 0; i < 9; i++) {
	if (money >= notes[i]) {
	notecount[i] = money/ notes[i];
	money = money - notecount[i] * notes[i];
	}
	}




	System.out.println("Dispensed amount");
	for (int i = 0; i < 9; i++) {
	if (notecount[i] != 0) {
	System.out.println( notecount[i]+" note of "+notes[i]);
	}
	}
	}



	public static void main(String argc[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to dispense");
	int money=sc.nextInt();
	dispense(money);
	}
	}

