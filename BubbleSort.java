package Practicals;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
			
			int arr[],temp,len;
			
			arr =new int[] {2,8,9,90,1,7,28,18,25}; 
		    temp=0;
			len=arr.length;
	
			//Before sorting the elements
			System.out.println("Before sorting : ");	
			for(int i=0;i<len;i++) {
				System.out.print(arr[i]+" ");
			} 
			
			
			//bubblesort 
			System.out.println("\n----Sorting----- ");
			for(int i=0; i < len; i++){ 
			  for(int j=1; j < (len-i); j++){ 
                	   if(arr[j-1] > arr[j]){  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
        }
			//After sorting the elements
			System.out.println("After sorting : ");	
			for(int i=0;i<len;i++) {
				System.out.print(arr[i]+" ");
			} 
			
			}
}

