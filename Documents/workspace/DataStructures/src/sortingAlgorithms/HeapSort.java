package sortingAlgorithms;

import java.util.Scanner;

public class HeapSort {

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
			heapSort(a);
			
			
			System.out.print("Sorted array ");
			
			for( i=0;i<a.length;i++){
				System.out.print(a[i]+" ");// print final array
			}

	}
	public static void makeHeap(int a[]){
		int n=a.length;
		for(int i=n/2;i>=0;i--){
			makeSubHeap(a,i);
		}
		
	}
	public static void makeSubHeap(int a[],int i){
		int temp=0;
		if(a[2*i+1] >=a[2*i+2])
			if(a[i]<a[2*i+1]){
				temp=a[i];
				a[i]=a[2*i+1];
				a[2*i+1]=temp;
				makeSubHeap(a,2*i+1);
			}
			
			else if(a[i]<a[2*i+2]){
					temp=a[i];
					a[i]=a[2*i+2];
					a[2*i+2]=temp;
					makeSubHeap(a,2*i+2);
					
				}
	
			
		}
	public static void heapSort(int a[]){
		int n=a.length;
			makeHeap(a);
			for(int i=n-1;i>=1;i--){
				int temp=a[0];
				a[0]=a[i];
				a[i]=temp;
				makeSubHeap(a,0);
			}
					
	}
		

}
