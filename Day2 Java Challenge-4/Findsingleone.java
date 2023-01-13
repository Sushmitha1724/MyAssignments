package week1.day2;

public class Findsingleone {

	    static int Single(int test[]) 
	    { 
            int nums=test.length;
	        int result = test[0]; 
	        for (int i = 1; i < nums; i++) 
	          result   = result ^ test[i]; 
	      
	        return result; 
	    } 
	  
	    public static void main (String[] args) 
	    { 
	        int test[] = {1,2,1}; 
	        System.out.println(" single number " + 
	                            Single(test) + " "); 
	    } 
	} 

