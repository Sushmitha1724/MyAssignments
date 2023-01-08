package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc= new Scanner(System.in);   //System.in is a standard input stream  
	        System.out.print("Enter your Number ");  
	        int n= sc.nextInt();
	        int count = 0;
	        if (n == 0 || n == 1) {
	            System.out.println("Prime number");
	            return;
	        }
	        for (int i = 2; i <= n; i++) {
	            if (n%i == 0) {
	                count++;
	            }
	            if (count >= 2) {
	                System.out.println("Not a prime");
	                break;
	            }
	        }
	        if (count == 1) {
	            System.out.println("Prime number");
	        }
	    }
	}
	


