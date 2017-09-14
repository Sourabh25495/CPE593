package searching;

import java.util.Scanner;

public class BinarySearch {
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
	BubbleSort(a);
	System.out.print("Sorted Array is ");
	for(i=0;i<n;i++){
		System.out.print(a[i]+ " ");
	}
	int l=0;
	int r=a.length-1;
	System.out.println();
	System.out.println("Enter the number to search for..");
	int x=sc.nextInt();
	
	System.out.println(Binary(a,l,r,x));

}
	
	public static int Binary(int[] a,int l,int r,int x){
		
		l=0;
		r=a.length-1;
		while(l<r){
			int guess =(l+r)/2;
			if(a[guess]>x){
				r=guess-1;
				
			}else if(a[guess]<x){
				l=guess+1;
			}
			else{
				return guess;
			}
			
		}

		return -1;
		
	}
	
	public static int[] BubbleSort(int a[]){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		return a;
		
	}
	
	
	
	
	
	
	
}
