import java.math.BigInteger;

/**
 * 
 * @author Marcin Orlowski "marcinor"
 *
 */
public class Main {

	public static void main(String[] args) {
		BigInteger pow = new BigInteger("2").pow(1000);
		int sum = 0;
		
		for(int i = 0; i<pow.toString().length(); i++) {
			sum+=pow.toString().charAt(i)-48;
		}
		System.out.println(sum);

	}

}
