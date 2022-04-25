package Practicals;

import java.util.*;

public class ArrayToList {
	
  
    public static void main(String args[])
    {
        // Create an Array
        String array[]
            = { "Rohit ", "Nandhan", "P" };
  
        // Print the Array
        System.out.println("Array: "
                           + Arrays.toString(array));
  
        // convert the Array to List
        List<String> list = convertArrayToList(array);
  
        // Print the List
        System.out.println("List: " + list);
    }
    
    public static <T>List<T> convertArrayToList(T array[])
    {
  
        // Create an empty List
        List<T> list = new ArrayList<>();
  
        // Iterate through the array
        for (T t : array) {
            // Add each element into the list
            list.add(t);
        }
        // Return the converted List
        return list;
    }
}