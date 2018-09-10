import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long digitsSum = 0;
		BigInteger factorial = new BigInteger("1");
		
		for(int i = 2; i<100; i++) {
			factorial = factorial.multiply(new BigInteger(i+""));
		}
		System.out.println(factorial);
		String factor = factorial.toString(); 
		for(int i = 0; i<factor.length(); i++) {
			digitsSum += (int) factor.charAt(i) - 48;
		}
		
		System.out.println("Suma cyfr = " + digitsSum);
	}

}
