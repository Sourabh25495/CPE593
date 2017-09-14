package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]){
		int n;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int i;
		int[] a=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("sorted array is ");
		Bubble(a,n);
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
	public static int[] Bubble(int a[], int n){
		int count=0, compare=0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				compare++;
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
					
				}
				for(int k=0;k<a.length;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println();
				
			}
			
		}
		System.out.println();
		System.out.println("No. of swaps "+count);
		System.out.println("No. of comparison "+compare);
		return a;
		
		
		
	}
	
	
	
}
