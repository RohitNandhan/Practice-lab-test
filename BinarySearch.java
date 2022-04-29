package Practicals;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
	static BinarySearch obj = new BinarySearch();
	
	public void getsearch(int arr[],int key) {
		int mid,first,last;
		first=0; 
		last = arr.length-1;
		
		while( first <= last ){	
			mid = (first + last)/2;
			if(arr[mid]<key) {
				first = mid+1;
			}else if(arr[mid]==key){
				System.out.println("The number "+key+" is found at index "+(mid+1));
				break;
			}else {
				last=mid-1;
			}
			if (first>last) { System.err.println("The number "+key+" is not found ");
		}
		}
	}
	public static void main(String args[]){
			
	        int arr[],mid,first,last;	
			arr =new int[] {2,3,7,10,12,15,53};
			System.out.println("ARRAY1 :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("\nEnter number to find : ");
			int key=sc.nextInt();
			obj.getsearch(arr, key);
			
			sc.close();
		}
}

