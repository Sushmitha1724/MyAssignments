package week1.day2;

public class HappyNumber {

	public static int numSum(int n)
	{
	    int squareSum = 0;
	    while (n!= 0)
	    {
	        squareSum += (n % 10) * (n % 10);
	        n /= 10;
	    }
	    return squareSum;
	}
	  
	public static boolean isHappynumber(int n)
	{
	    int i, j;
	    i = j = n;
	    do
	    {
	        i = numSum(i);
	        j = numSum(numSum(j));
	  
	    }
	    while (i != j);
	  
	    return (i == 1);
	}
	  
	//  Driver code to test above methods
	public static void main(String[] args)
	{
	    int n = 19;
	    if (isHappynumber(n))
	        System.out.println(n +
	        " is a Happy number");
	    else
	        System.out.println(n +
	        " is not a Happy number");
	}
	}

