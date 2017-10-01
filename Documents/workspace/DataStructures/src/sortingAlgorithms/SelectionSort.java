package sortingAlgorithms;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int i;
		int[] a=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		/*
		for(i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		*/
	
		
	
		for ( i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index]) 
                    index = j;
      
            int smallerNumber = a[index];  
            a[index] = a[i];
             a[i] = smallerNumber;
        }
		
		System.out.print("Sorted array ");
		
		for(i=0;i<n;i++){
			System.out.print(a[i]);// print final array
		}
		
		
	}
}
	


