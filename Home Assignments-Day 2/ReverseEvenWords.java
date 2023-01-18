package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		 String[] Split =test.split(" ");  
		int i;
		for ( i =Split.length-1; i>= 0; i--) {
			if (i%2!=0) {
				System.out.println(Split[i]+" ");
			}
				
	}

	}
}
