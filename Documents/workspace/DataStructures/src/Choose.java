
import java.util.*;
public class Choose {
	
	public static void main(String [] args) {
		int n=0,r=0; 
		 
		Scanner sc = new Scanner(System.in); // Scanner object to take user input
		System.out.println("Enter the value for total number of objects 'n':");
		n=sc.nextInt();
		System.out.println("Enter the value 'r' for choose function:");
		r=sc.nextInt();
		calculate(n,r);
		
		}
		
	
	// Factorial computation recurrsive function
	public static long fact(long a) {
		return a<=1 ? 1 : a*fact(a-1);
	}
	
	public static int  calculate(int a, int b){
		if(a>b || a==b) {
			long C=(fact(a)/(fact(b)*fact(a-b))); // Calling recurrsive 'fact' function to compute combination
			System.out.println("-----Combination-----\n n choose r = "+ C); //print output
		}
		else
			System.out.println("Wrong entry! TRY AGAIN!");
		return 0;
		
	

}
}
