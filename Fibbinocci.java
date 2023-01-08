package week1.day1;

public class Fibbinocci {

	public static void main(String[] args)
	{
		int firstNum=0,secondNum=1,sum=0;
		System.out.print(firstNum+" "+secondNum);
		
		for(int i=2;i<11;i++)
			
		{
			sum=firstNum+secondNum;
			 System.out.print(" "+sum);
			firstNum=secondNum;
			secondNum=sum;
		}
	}
}


