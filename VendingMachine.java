import java.util.*;
public class VendingMachine {
	static int[]notes= {1000,500,100,50,10,5,2,1};
	static int i=0;
	static int total=0;
	static int calculateNotes(int amount,int[]notes) {
		int rem=0;
		if(amount==0) {
            System.out.println("Invalid input");
		}else {
		if(amount>=notes[i]) {
			int calNotes=amount/notes[i];                 //6
			rem=amount% notes[i];                    //745
			amount=rem;                             //money=745
			total=total+calNotes;
			System.out.println("Number of Rs"+notes[i]+":notes are "+calNotes);
		}
		i++;
		}
		return calculateNotes(amount,notes);
	}                                                //6745
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		calculateNotes(amount,notes);
		System.out.println("Total number of notes :"+ total);
	}
}
