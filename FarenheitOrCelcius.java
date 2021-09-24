import java.util.*;
public class FarenheitOrCelcius {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temprature in farenheit to convert into celcius");
		float farenheitTemp1=sc.nextFloat();
		float celcius1=(farenheitTemp1-32)*5/9;
		System.out.println(farenheitTemp1 +" in celcius is: "+celcius1);
		System.out.println("Enter the temprature in celcius to convert into farenheit");
		float celcius2=sc.nextFloat();
		float farenheitTemp2=(celcius2*9/5)+32;
		System.out.println(celcius2 +" in farenheit is: "+farenheitTemp2);
	}
}
