import java.util.Scanner;

public class InsertionSort {

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
		Insertion(a,n);

	}
	public static  void Insertion(int a[], int n){
		for (int i=1; i<n; ++i)
        {
            int key = a[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && a[j] > key)
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
		
System.out.print("Sorted array ");
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]);// print final array
		}
		
	}
	

}
