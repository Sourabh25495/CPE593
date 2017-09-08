package sortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

/* Class MergeSort */
public class MergeSort 
{
 public static void main(String[] args){
	 
	 int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int i;
		int[] a=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
	 	mergeSort(a); 
	 	  System.out.print("Sorted array ");
			
			for( i=0;i<a.length;i++){
				System.out.print(a[i]+" ");// print final array
			}
	 
	 
 }


 public static void mergeSort(int[] a){
	 int size = a.length;
	 if(size<=1){
		 return;
	 }
     int mid = size / 2;
     int leftSize = mid;
     int rightSize = size - mid;
     int[] left = new int[leftSize];
     int[] right = new int[rightSize];
     for (int i = 0; i < mid; i++) {
         left[i] = a[i];

     } 
     for (int i = mid; i < size; i++) {
         right[i - mid] = a[i];
     }
     mergeSort(left);
     mergeSort(right);
     merge(left, right, a);


 }

	 
	  


 public static void merge(int left[], int right[], int[]a){
	 
	 

	 int leftSize = left.length;
     int rightSize = right.length;
     int i = 0, j = 0, k = 0;
     while (i < leftSize && j < rightSize) {
         if (left[i] <= right[j]) {
             a[k] = left[i];
             i++;
             k++;
         } else {
             a[k] = right[j];
             k++;
             j++;
         }
     }
     while (i < leftSize) {
         a[k] = left[i];
         k++;
         i++;
     }
     while (j < leftSize) {
         a[k] = right[j];
         k++;
         j++;
     }
   
 }
	 
	 
	 
	 
 }

 
 
 
 
 
 
 
 
 
 
   


