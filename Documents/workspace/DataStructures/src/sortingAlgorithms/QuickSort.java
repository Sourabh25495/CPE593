package sortingAlgorithms;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

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
		int L=0;
		int R=a.length-1;
		Quick(a,L,R);
		System.out.print("Sorted array is ");
		
		System.out.println(Arrays.toString(a));

	}
	
	
	
	
	
	
	public static  void Quick(int a[], int L, int R){
		if(a.length==0 || a==null)
			return;
		
		int middle=(L+R)/2;
		int pivot=a[middle];
		//System.out.print(pivot);
		int i=L, j=R;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
 
			while (a[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
 
		if(L<j)
			Quick(a, L, j);
		if(i<R)
			Quick(a, i, R);
				
		
	}
	
	

}
