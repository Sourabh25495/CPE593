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

	}
	public void makeHeap(int a[]){
		int n=a.length;
		for(int i=n/2;i>0;i--){
			makeSubHeap(a,i);
		}
		
	}
	public void makeSubHeap(int a[],int i){
		int temp=0;
		if(a[2*i+1] > a[2*i+2])
			if(a[i]>a[2*i+1])
				temp=a[i];
				a[i]=a[2*i+1];
				a[2*i+1]=temp;
				makeSubHeap(a,2*i+1);
					
	}
	
	
	
	
	
	
	
	
	

}
