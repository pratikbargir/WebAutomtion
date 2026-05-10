package PageObject_Code;

import java.util.Arrays;
import java.util.HashSet;

public class Prac_Pro {

    public static void main(String [] args){

        int arr [] ={1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int index = Arrays.binarySearch(arr,target);

        if(index>=0){

            System.out.println("Element found at index: "+ index);
        }
        else{
            System.out.println("Element not found in the array");
        }
        
        int arr1[] = {4,4,4,5,6,7,5,4,5,6,7,8,5,4,6,2,1,2};
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num : arr1)
        {
            if(!uniqueElements.add(num))
            {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements in the array: " + duplicates);

    }


    }
