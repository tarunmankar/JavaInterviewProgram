/* Que - Sort an array of 0's, 1's, and 2's (Dutch National Flag Problem)
input  - 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0
output - 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2
*/

public class Test{
	public static void main (String[] args)
    {
        int[] arr = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        
        segragate012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
	
	public static void segragate012(int arr[], int n)
	{
	    int zeros = 0, ones = 0, two =0;
	        
	    for(int i =0; i < n; i++)
	    {
	        if(arr[i] == 0)
	        {
	            zeros++;
	        }
	        else if(arr[i] == 1)
	        {
	            ones++;
	        }
	        else if(arr[i] == 2)
	        {
	            two++;
	        }
	    }
		
	    for(int i =0; i < zeros; i++)
	    {
	        arr[i] = 0;
	    }
	    
	    for(int i = zeros; i < zeros+ones; i++)
	    {
	        arr[i] = 1;
	    }
	    
	    for(int i = zeros+ones; i < zeros+ones+two; i++)
	    {
	        arr[i] = 2;
	    }
		
	    /*
	    int i=0;
	    while(0<zeros)
	    {
	        arr[i] = 0;
	        i++;
	        zeros--;
	    }
	    
	    while(0<ones)
	    {
	        arr[i] = 1;
	        i++;
	        ones--;
	    }
	    
	    while(0<two)
	    {
	        arr[i] = 2;
	        i++;
	        two--;
	    }
	    */
	}
} 
