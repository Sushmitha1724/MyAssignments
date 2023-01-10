package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="changeme";
		
		char[] charArray = test.toCharArray();
for (int i=0; i<charArray.length; i=i+2) {
	charArray[i] = Character.toUpperCase(charArray[i]);
}
System.out.println(new String (charArray));
	}

}
