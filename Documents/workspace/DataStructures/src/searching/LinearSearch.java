package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int i;
		int[] a=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search for..");
		int x=sc.nextInt();
		//Search(a,n,i);
		System.out.println("The number "+x+" is located at index " + Search(a,n,x));
		

	}
	public static int Search(int[] a, int n, int x){
		for(int i=0;i<n;i++){
			if(a[i]==x){
				return i;
			}
		}
		return-1;
	}

}
