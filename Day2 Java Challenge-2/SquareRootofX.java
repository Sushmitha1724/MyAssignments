package week1.day2;

public class SquareRootofX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			double num = 24;
			double root;
			root = square(num);
			System.out.println("Input :X = "+num);
			System.out.println("Output:"+Math.floor(root));
			}
		
		}


	private static double square(double input) {
		// TODO Auto-generated method stub
		double t;
		double squareroot = input / 2;
		do 
		{
		t = squareroot;
		squareroot = (t + (input / t)) / 2;
		}
		 while ((t - squareroot) != 0);
		return squareroot;
		}

	
}

