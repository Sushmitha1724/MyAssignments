package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="race a car";
String str1=str.toLowerCase().replaceAll(",","").replaceAll(" ","").replaceAll(":","");
String rev="";

for(int i=str1.length()-1;i>=0;i--) {
	rev=rev+str1.charAt(i);
}
if(str1.equals(rev)) {
	System.out.println(true);
	System.out.println("It is a palindrome");
}
	else
{
	System.out.println(false);
	System.out.println("Not a palindrome");	
}
	}

}
