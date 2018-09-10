import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		long n = 600851475143L;
		
		BigInteger number = new BigInteger("1");
		while(number.longValue()<n/2) {
			number = number.nextProbablePrime();
			if(n%(number.longValue())== 0)
				System.out.println(number.longValue());
		}
	}

}
