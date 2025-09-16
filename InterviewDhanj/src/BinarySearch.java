
public class BinarySearch {
	
	int binarySearch(int arr[], int startLength, int endLength, int element) {
		
		  if(endLength >= startLength) {
			  
			  int mid = startLength + (endLength - startLength)/2;
			  
			  if(arr[mid] == element) {
				  return mid;
			  }
			  
			  if(arr[mid]> element) {
				  return binarySearch(arr, 0, mid-1, element );
			  }
			  else {
				  return binarySearch(arr, mid+1, endLength, element);
			  }
			  
		  }
		  return -1;
		
	}
	
	public static void main(String args[]) {
		
		BinarySearch bs =  new BinarySearch();
		int arr[] = {2,6,8,10,20};
		int n= arr.length;
		int a = 10;
		
		int result = bs.binarySearch(arr, 0, n-1, a);
		
		if(result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element:::"+result);
		}
				
			
		
		
	}

}
