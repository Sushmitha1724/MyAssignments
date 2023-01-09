package week1.day2;

import java.util.Scanner;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);   //System.in is a standard input stream  
	        System.out.print("Enter you text "); 
	        String n = sc.nextLine();
	        String[] split = n.split(" ") ;
	        int length=split.length;
	        System.out.println(split[split.length-1].split("").length);
	       
	}

}

