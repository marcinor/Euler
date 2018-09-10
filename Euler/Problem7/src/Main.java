import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		BigInteger prime = BigInteger.valueOf(1);
		int limit = 10001;
		
		for(int i=0; i<limit; i++) {
			prime=prime.nextProbablePrime();
		}
		System.out.println("Prime nr "+limit+": "+prime);

	}

}
