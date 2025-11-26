package Assignment4_Q2;

public class Tester {
    public static int NthOccurance(int arr[],int key,int n)
    {
    	int temp=-1;
    	int count=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		
    		if(arr[i]==key)
    		{
    			temp=i;
    			count++;
    			if(count==n)
    			{
    				return temp;
    				
    			}
    		}
    	}
    	return temp;
    			
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[] {1,3,1,5,6,2,5,1,4,2,1};
        int key=1;
        int n=2;
        int x=NthOccurance(arr,key,n);
        System.out.println("last occurance is"+x);
        
        
        
	}

}
