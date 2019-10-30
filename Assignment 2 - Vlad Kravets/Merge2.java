


public class MergeSort 
{  
	public static void main (String[] args) {
		
		// In order to use Merge Sort I started with a single array instead of 2
		int [] input = {1,3,5,15,20, 2,4,5,6,55};
		sorting(input, 0, input.length - 1);
		
		for (int i = 0; i < input.length; i++) 
			System.out.print(input[i] + " ");
		
	}
	  
	
	
	private static void merge(int arr[], int left, int m, int right) 
    { 
        // Sizes of 2 array that to be merged
        int array1 = m - left + 1; 
        int array2 = right - m; 
  
        // Create temp arrays 
        int tempLeft[] = new int [array1]; 
        int tempRight[] = new int [array2]; 
  
        // Copy data to temp arrays
        for (int i=0; i<array1; ++i) 
            tempLeft[i] = arr[left + i]; 
        
        for (int j=0; j<array2; ++j) 
        	tempRight[j] = arr[m + 1+ j]; 
  
        // Indexes for temp arrays 
        int i = 0, j = 0; 
  
        // Initial index of merging array 
        int k = left; 
        while (i < array1 && j < array2) 
        { 
            if (tempLeft[i] <= tempRight[j]) 
                arr[k] = tempLeft[i++]; 
            else
                arr[k] = tempRight[j++]; 
 
            k++; 
        } 
  
        // move the remaining elements
        while (i < array1) 
            arr[k++] = tempLeft[i++]; 
  
        while (j < array2) 
            arr[k++] = tempRight[j++]; 

    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public static void sorting(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            int middle = (left + right) / 2; 
  
            // Sort first and second halves 
            sorting(arr, left, middle); 
            sorting(arr , middle + 1, right); 
  
            // Merge the sorted halves 
            merge(arr, left, middle, right); 
        } 
    }
    
}
	
	


