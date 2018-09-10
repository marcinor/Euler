/**
 * 
 * @author Marcin Or³owski "marcinor"
 * 
 *  Numbers a and b are amicable when d(a) = b, d(b) = a and a != b.
 *  
 *  d(n) - sum of proper divisors of n (numbers less than n which divide evenly into n).
 *
 */
import pl.marcinor.MyMathLib.lib.*;

public class Main {

	public static void main(String[] args) {
		final int limit = 10000;
		int sumOfDividers = 0;
	
		for(int i=1; i<limit; i++) {
			if(MyMathLib.isAmicable(i)) {
				if(MyMathLib.sumOfDividers(i)>i) {
					System.out.println(i + " " + MyMathLib.sumOfDividers(i));
					sumOfDividers += i + MyMathLib.sumOfDividers(i);
				}
			}
		}
		System.out.println(sumOfDividers);

	}
}