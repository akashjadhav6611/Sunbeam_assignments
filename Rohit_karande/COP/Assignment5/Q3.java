//3. Write a Java Program to check if see if Array contains a specific value.


		
		import java.util.Arrays;
		 
	class Q3{
		 
	   
	 
	    public static void main(String[] args)
	    {
	        int arr[] = { 1,2,34,23,12,43,5,7,6,21,75 };
	        int value = 56;
	        System.out.println("Array: "+ Arrays.toString(arr));
	        
	        int length=arr.length;
	        int check=0;
	        for(int i=0;i<length;i++) {
	        	if(arr[i]==value) {
	        		check=1;
	        		break;
	        	}
	        }
        	//System.out.println("Array contains value "+value+" = "+check);
        if(check==1) {
        	System.out.println("Array contains given value "+value);
        }else {
        	System.out.println("Array does not contains value "+value);

        }
	    }

	}
		
		
		
		
		
		
		
		
	
