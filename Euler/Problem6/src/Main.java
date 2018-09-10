
public class Main {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int limit=100;
		
		for(int i=1; i<=limit; i++) {
			sumOfSquares+=i*i;
			squareOfSum+=i;
		}
		System.out.println("Sum of squares: " + sumOfSquares);
		System.out.println("Square of sum: " + squareOfSum*squareOfSum);
		System.out.println("Difference: " + (squareOfSum*squareOfSum-sumOfSquares));
	}

}
