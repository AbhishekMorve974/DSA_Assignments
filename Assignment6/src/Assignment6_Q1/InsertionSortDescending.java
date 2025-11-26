package Assignment6_Q1;



	public class InsertionSortDescending {
	    
	   
	    public static void insertionSortDesc(int arr[]) {
	        for (int i = 1; i < arr.length; i++) {
	            int temp = arr[i];
	            int j = i - 1;

	          
	            while (j >= 0 && arr[j] < temp) {  
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = temp;
	        }
	    }

	 
	    public static void main(String[] args) {
	        int arr[] = {5, 2, 9, 1, 3};

	        System.out.println("Before Sorting:");
	        for (int x : arr)
	            System.out.print(x + " ");

	       
	        insertionSortDesc(arr);

	        System.out.println("\nAfter Sorting (Descending):");
	        for (int x : arr)
	            System.out.print(x + " ");
	    }
	}


