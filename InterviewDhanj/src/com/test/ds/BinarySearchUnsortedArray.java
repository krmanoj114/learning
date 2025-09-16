package com.test.ds;

public class BinarySearchUnsortedArray {
	
	// Returns index of key in arr[l..h] 
    // if key is present, otherwise returns -1
    static int search(int arr[], int l, int h, int key)
    {
        if (l > h) 
            return -1;
       
        int mid = (l+h)/2;
        if (arr[mid] == key)
            return mid;
       
        /* If arr[l...mid] is sorted */
        if (arr[l] <= arr[mid])
        {
            /* As this subarray is sorted, we 
               can quickly check if key lies in 
               half or other half */
            if (key >= arr[l] && key <= arr[mid])
               return search(arr, l, mid-1, key);
       
            return search(arr, mid+1, h, key);
        }
       
        /* If arr[l..mid] is not sorted, 
           then arr[mid... r] must be sorted*/
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid+1, h, key);
       
        return search(arr, l, mid-1, key);
    }
    
	public static void main(String args[]){
		
		int arrayList[] = {4,6,8,10,2,3};
		int arrayLength = arrayList.length;
		int searchingElement = 2;
		int i = search(arrayList, 0, arrayLength, searchingElement);
        if (i != -1) 
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
	}

}
