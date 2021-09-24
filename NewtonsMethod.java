import java.util.*;
 class NewtonsMethod {
	public static void main(String[]args)   {
		try {
			double a=Double.parseDouble(args[0]);
			double epsilon=1e-15;
			double t=a;
			while(Math.sqrt(t-a/t)>epsilon*t) {
				t=(a/t+t)/2.0;
			}
			System.out.println(t);
		}catch(Exception e) {
			System.out.println("Exception is :"+e);
		    }
	}
}
