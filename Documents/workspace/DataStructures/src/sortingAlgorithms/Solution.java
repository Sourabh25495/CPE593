package sortingAlgorithms;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int temp=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int arrSize=sc.nextInt();
        int arr[]=new int[arrSize];
        
        for(int i=0;i<arrSize;i++)
            arr[i]=sc.nextInt();
        
        
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
           
            

        
        
        
        }
        for(int i=0;i<arrSize;i++)
            System.out.print(arr[i]+" ");
            
        
        
        
        
        
        
        
        
          
        
        
    }
}
