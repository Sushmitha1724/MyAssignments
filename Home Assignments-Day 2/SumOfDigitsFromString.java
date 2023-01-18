package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tes12Le79af65";
		int sum = 0;
		str = str.replaceAll("[^0-9]","");
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++){
		sum = sum + Character.getNumericValue(ch[i]);
		}
		System.out.println(" "+sum+" ");
		
	}

}
