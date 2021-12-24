package test;

import java.util.Scanner;

public class CreditCard {
	public static boolean isValid(long number) {
		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number)>=13 )
		&& (getSize(number)<=16 )) {
		return true;
		} else {
		return false;
		}
		}
		public static int getDigit(int number) {
		if (number <= 9) {
		return number;
		} else {
		int firstDigit = number % 10;
		int secondDigit = (int) (number / 10);
		return firstDigit + secondDigit;
		}
		}
		public static int sumOfOddPlace(long number) {
		int result = 0;
		while (number > 0) {
		result += (int) (number % 10);
		number = number / 100;
		}
		return result;
		}
		public static int sumOfDoubleEvenPlace(long number) {
		int result = 0;
		long temp = 0;
		while (number > 0) {
		temp = number % 100;
		result += getDigit((int) (temp / 10) * 2);
		number = number / 100;
		}
		return result;
		}
		public static boolean prefixMatched(long number, int d) {

		String card;
		if ((getPrefix(number, d) == 4)
		|| (getPrefix(number, d) == 5)
		|| (getPrefix(number, d) == 6)
		|| (getPrefix(number, d) == 37)) {

		if (getPrefix(number, d) == 4) {
		card = ("Visa ");
		} else if (getPrefix(number, d) == 5) {
		card = ("Master");
		} else if (getPrefix(number, d) == 6) {
		card = ("Discover Card ");
		} else if (getPrefix(number, d) == 37) {
		card = ("American Express cards");
		}
		return true;

		} else {

		return false;

		}
		}


		public static int getSize(long d) {

		int count = 0;


		while (d > 0) {
		d = d / 10;

		count++;
		}

		return count;


		}


		public static long getPrefix(long number, int k) {

		if (getSize(number) < k) {
		return number;
		} else {

		int size = (int) getSize(number);

		for (int i = 0; i < (size - k); i++) {
		number = number / 10;
		}
		return number;
		}
		}
		public static void main(String[] args) {

		long number;
		// Create scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");

		number=input.nextLong();
		if (isValid(number)) {
		String card = null;
		long n=getPrefix(number,1);
		if (n == 4)
		card = "\nVisa ";

		else if (n == 5)
		card = "\nMaster ";
		else if (n == 6)
		card = "\nDiscovery ";

		else if (n==3)
		card = "\nAmerican Express,Diner's Club or Carte Blanche payment networks";
		System.out.print("This is a valid "+card+"Card Number");
		}
		else
		System.out.print("This is Invalid Credit Card Number");
		}
		}