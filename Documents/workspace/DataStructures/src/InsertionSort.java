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
		for(int i=1;i<n;i++){
			int temp=a[i];
			for(int j=i;j>=0;j--){
				if(a[j]>=temp){
					a[j+1]=a[j];
				}else{
					a[j+1]=temp;
				break;
				}
					
			}
			a[0]=temp;
		}
System.out.print("Sorted array ");
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]);// print final array
		}
		
	}
	

}
