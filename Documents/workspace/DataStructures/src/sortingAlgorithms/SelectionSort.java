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
	
		
	
	
		for( i=n-1;i>0;i--){
			int pos=0;
			for(int j=1;j<i;j++){
				if(a[j]>a[pos])
					pos=j;	
			}

			
			// now you have incremented the position. Swap the contents sitting on them
			int temp=a[pos];
			a[pos]=a[i];
			a[i]=temp;	
			
		
		}
		
		System.out.print("Sorted array ");
		
		for(i=0;i<n;i++){
			System.out.print(a[i]);// print final array
		}
		
		
	}
}
	


