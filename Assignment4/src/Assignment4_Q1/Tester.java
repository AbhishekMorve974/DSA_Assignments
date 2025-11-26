package Assignment4_Q1;

public class Tester {
    public static int lastOccurance(int arr[],int key)
    {
    	int temp=-1;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		
    		if(arr[i]==key)
    		{
    			temp=i;
    		}
    	}
    	return temp;
    			
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[] {1,3,5,6,2,1,4};
        int key=1;
        int x=lastOccurance(arr,key);
        System.out.println("last occurance is"+x);
        
        
        
	}

}
