package com.test.ds;

public class BubbleSort {
	
	public static void bubbleSort(int arrayList[]){
		
		int n =arrayList.length;
		
		for(int i=0; i< n-1; i++){
			for(int j=0; j< n-i-1; j++){
				 if (arrayList[j] > arrayList[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arrayList[j];
	                    arrayList[j] = arrayList[j+1];
	                    arrayList[j+1] = temp;
	                }
				
			}
		}
		
	}
	
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String args[]){
		
		int arrayList[] = {3,6,9,2,1,17};
		
		BubbleSort bs = new BubbleSort();
		
		bs.bubbleSort(arrayList);
		System.out.println("Sorted array");
        bs.printArray(arrayList);
		
	}

}
