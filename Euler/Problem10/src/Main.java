import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		BigInteger prime = BigInteger.valueOf(2);
		long sum = 0;
		
		while(prime.longValue() < 2000000) {
			sum+=prime.longValue();
			prime=prime.nextProbablePrime();
			System.out.println(prime);
		}
		System.out.println("Sum: "+sum);
	}

}
