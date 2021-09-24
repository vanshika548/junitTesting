import java.util.*;
public class MonthlyPayment {
	static int payment=0;
	static int n=0;
	static int r=0;
	public static void monthlyPayment(int principal,int rate, int year) {
		r=rate/12;
		n=12*year;
		int cal=(int)Math.pow(1+r, (-n));
		payment=(principal*r)/(1-cal);
		System.out.println("Calculate payment: "+payment);
	}
	public static void main(String []args) {
		int principal=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println("The values of principal is:"+principal+" rate is: "+rate+" year is: "+year );
		monthlyPayment(principal,rate,year);
		
	}
}
