package test;
import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,arm;
		System.out.println("Armstrong numbers between 1 to 500");
		while(i<=500)
		{
		arm=armstrongOrNot(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
		static int armstrongOrNot(int num)
		{
		int x,a=0;
		while(num!=0)
		{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
		}
		return a;
		}
		}
